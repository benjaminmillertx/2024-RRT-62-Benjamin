//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sba.sms.services;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import sba.sms.dao.CourseI;
import sba.sms.models.Course;
import sba.sms.utils.HibernateUtil;

public class CourseService implements CourseI {
    public CourseService() {
    }

    public void createCourse(Course course) {
        Transaction transation = null;

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();

            try {
                transation = session.beginTransaction();
                Course existcourse = (Course)session.get(Course.class, course.getId());
                if (existcourse == null) {
                    session.persist(course);
                } else {
                    existcourse.setId(course.getId());
                    existcourse.setName(course.getName());
                    existcourse.setInstructor(course.getInstructor());
                    session.saveOrUpdate(existcourse);
                }

                transation.commit();
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
        } catch (Exception var8) {
            Exception e = var8;
            if (transation != null && transation.isActive()) {
                transation.rollback();
            }

            e.printStackTrace();
        }

    }

    public Course getCourseById(int courseId) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Course var3;
        try {
            var3 = (Course)session.get(Course.class, courseId);
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

    public List<Course> getAllCourses() {
        Session session = HibernateUtil.getSessionFactory().openSession();

        List var2;
        try {
            var2 = session.createQuery("from Course", Course.class).list();
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
}

