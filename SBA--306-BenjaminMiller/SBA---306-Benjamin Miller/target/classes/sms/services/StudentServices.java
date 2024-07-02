//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sba.sms.services;

import Exceptions.StudentAlreadyExistsException;
import java.util.Collections;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sba.sms.dao.StudentI;
import sba.sms.models.Course;
import sba.sms.models.Student;
import sba.sms.utils.HibernateUtil;

public class StudentService implements StudentI {
    public StudentService() {
    }

    public List<Student> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List var2;
        try {
            var2 = session.createQuery("from Student", Student.class).list();
        } catch (Throwable var5) {
            if (session != null) {
                try {
                    session.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }
            }

            throw var5;
        }

        if (session != null) {
            session.close();
        }

        return var2;
    }

    public void createStudent(Student student) {
        Transaction transaction = null;

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            try {
                transaction = session.beginTransaction();
                Student existingStudent = (Student)session.get(Student.class, student.getEmail());
                if (existingStudent != null) {
                    throw new StudentAlreadyExistsException("Student with email " + student.getEmail() + " already exists");
                }

                session.persist(student);
                transaction.commit();
            } catch (Throwable var7) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                    }
                }

                throw var7;
            }

            if (session != null) {
                session.close();
            }
        } catch (HibernateException var8) {
            HibernateException e = var8;
            if (transaction != null) {
                transaction.rollback();
            }

            e.printStackTrace();
        } catch (StudentAlreadyExistsException var9) {
            StudentAlreadyExistsException e = var9;
            throw new RuntimeException(e);
        }

    }

    public Student getStudentByEmail(String email) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Student var3;
        try {
            var3 = (Student)session.get(Student.class, email);
        } catch (Throwable var6) {
            if (session != null) {
                try {
                    session.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }
            }

            throw var6;
        }

        if (session != null) {
            session.close();
        }

        return var3;
    }

    public boolean validateStudent(String email, String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            boolean var5;
            try {
                Student student = (Student)session.createQuery("FROM Student WHERE email = :email", Student.class).setParameter("email", email).uniqueResult();
                var5 = student != null && student.getPassword().equals(password);
            } catch (Throwable var7) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                    }
                }

                throw var7;
            }

            if (session != null) {
                session.close();
            }

            return var5;
        } catch (Exception var8) {
            Exception e = var8;
            e.printStackTrace();
            return false;
        }
    }

    public void registerStudentToCourse(String email, int courseId) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            try {
                Transaction transaction = session.beginTransaction();
                Student student = (Student)session.createQuery("FROM Student WHERE email = :email", Student.class).setParameter("email", email).uniqueResult();
                Course course = (Course)session.get(Course.class, courseId);
                if (student != null && course != null) {
                    student.getCourses().add(course);
                    course.getStudents().add(student);
                    session.persist(student);
                    session.persist(course);
                }

                transaction.commit();
            } catch (Throwable var8) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                    }
                }

                throw var8;
            }

            if (session != null) {
                session.close();
            }
        } catch (Exception var9) {
            Exception e = var9;
            e.printStackTrace();
        }

    }

    public List<Course> getStudentCourses(String email) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            List var3;
            try {
                var3 = session.createQuery("SELECT c FROM Course c JOIN c.students s WHERE s.email = :email", Course.class).setParameter("email", email).list();
            } catch (Throwable var6) {
                if (session != null) {
                    try {
                        session.close();
                    } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                    }
                }

                throw var6;
            }

            if (session != null) {
                session.close();
            }

            return var3;
        } catch (Exception var7) {
            Exception e = var7;
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
