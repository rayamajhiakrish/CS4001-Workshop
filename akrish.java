
/**
 * Write a description of class akrish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class akrish
{
    

     public static void main(String[] args){
         Scanner scan = new Scanner(System.in);
         System.out.print("Enter distance(km): ");
         double distance = scan.nextDouble();
         System.out.print("Enter time (minutes): ");
         int time = scan.nextInt();
         scan.nextLine();
         System.out.print("Is the customer local?(yes/no): ");
         String localInput = scan.nextLine();
         boolean isLocal = localInput.equalsIgnoreCase("yes")? true:false;
         System.out.print("Is it night time? (yes/no): ");
         String nightInput = scan.nextLine();
         boolean isNight= nightInput.equalsIgnoreCase("yes")? true:false;
         double fare = (distance * 20) + (time * 1);
         fare = isLocal? fare * 0.90 : fare; //10% discound
         fare = isNight? fare * 1.20 : fare; //20% added
         System.out.println("Total Fare: Rs. " + Math.round(fare));
         
         
         
     }
}

