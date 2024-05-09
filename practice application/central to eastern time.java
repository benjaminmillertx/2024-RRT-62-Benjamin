import 
java.time.LocalDateTime;
import java.time.ZoneId;
import
java.time.ZonedDateTime;

public class
CentralToEasterntime{

public static void
main(String[] args) {
//Get current time in Central Time
LocateDateTime
centralTime=
LocalDateTime.now(ZoneId.of("America/Chicago));

//Convert Central Time to Eastern Time
ZoneDateTime
centralZonedDateTime=centralTime.atZone(ZoneId.of("America/Chicago"));
ZonedDateTime easternZonedDateTime.withZoneSameInstant(ZoneId.of('American/New_York"));

  //Print the converted time
  System.out.println("centralTime);

  System.out.println("Eastern Time:"+
  easternZonedDateTime.toLocal-DateTime());
 }
}
