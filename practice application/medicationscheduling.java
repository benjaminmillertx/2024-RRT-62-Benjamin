import java.util.*;

class Medication (
  String name;
  int hour;
  int minute;

  public Medication(String name,int hour,int minute) {
     this.name = name;
     this.hour = hour;
     this.minute = minute;
  }
}

public class MedicationScheduler{
  medications= new ArrayList<>();
  timer= new Timer();
}
public void
addMedication(String name,int hour int minute){
medication.add(new Medications(name,hour,minute));
}

public void
scheduleMedications() {
for(Medication med: medications) {
Calendar calendar = Calendar.getInstance();

calendar.set(Calendar.MINUTE,med.minute);

calendar.set(Calendar.SECOND,0);

Date time=calendar.getTime();

if(time.before(new Date())) {
  //If the time has already passed today,
 // scedule it for tommorow

calendar.add(Calendar.DAY_OF_Month, 1);

time=calendar.getTime();
}

timerTask(){

@override
public void 
run() {

System.out.println('Time to take medication:" + med.name);
                           }
                      }, time);
                 }
           } 
public static void 
main(String[] args) {
MedicationScheduler scheduler = new MedicationScheduler();
// Add medications

scheduler.addMedication("Medicine A",8,0);
//Example time: 8:00  AM
scheduler.addMedication("Medicinr B",12,30);
//Example time:12:30 PM

//Schedule medications
scheduler.scheduleMedications();
   }
}

  
