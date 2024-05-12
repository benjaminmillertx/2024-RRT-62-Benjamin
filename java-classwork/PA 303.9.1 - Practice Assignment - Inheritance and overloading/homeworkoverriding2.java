import java.io.*; 
import java.util.*; 
class Cycle 
{ 
    void print() 
    { 
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine."); 
        } 
        }

class Motorcycle extends Cycle 
{ 
    void print() 
    { 
        super.print(); // Call the overridden method in the superclass 
        System.out.println("My ancestor is a cycle who is a vehicle with pedals."); } }

public class main
{
    public static void main(String[] args) 
    { 
        Motorcycle motorbike = new Motorcycle(); 
        motorbike.print(); 
        } 
        }
