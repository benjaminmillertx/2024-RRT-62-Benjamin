public class Doctor {
   String DoctorName;
   String Department;
  public void Doctor_Details() {
       System.out.println("Doctor Details...");
   }
}
public class Surgeon extends Doctor {
   void Surgeon_Details() {
       System.out.println("Surgeon  Detail...");
       System.out.println(Department = "Cardio");
   }
}

public class Hospital {
   public static void main(String args[]) {
       Surgeon s = new Surgeon();
       s.Doctor_Details();
       s.Surgeon_Details();
   }
}
