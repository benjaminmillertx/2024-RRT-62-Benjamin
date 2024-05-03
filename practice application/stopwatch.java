//basic example using System.nanoTime():
public class Stopwatch { 
private long startTime;
private boolean is Running;

public void start() { 
  if (!isRUnning) {
      startTime=System.nanoTime();
  isRunning=true;
  }
}
  public void stop() {
  if(isRunning)=false; 
  long endTime=System.nanoTime()
  long elaspedTime=endTime -startTime;
  double secounds =(double)elaspsedTime /
  1_000_000_000_0;

  System.out.println("Elasped Time: " + secounds = "seconds+ "
  secounds");
  }
}
public static void
main(String [] args) {
    Stopwatch stopwatch = new Stopwatch();
stopwatch.start();
//Simulate some task
for (int i =0; i < 1000000;i++) {
  //some task here 
}
stopwatch.stop();
 }
}
