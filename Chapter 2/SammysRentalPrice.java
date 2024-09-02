
import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
         final int HOURLY_RATE = 40;
         final int  ADDITIONAL_MINUTE_RATE = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun.    S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS\n");
       
        System.out.print("Number of minutes rented: ");
        int totalMinutes = inp.nextInt();

        int hours = totalMinutes / 60;
        int additionalMinutes = totalMinutes % 60;

        double totalPrice;
        if (totalMinutes < 60) {
            totalPrice = HOURLY_RATE;
        } else {
            totalPrice = (hours * HOURLY_RATE) + (additionalMinutes * ADDITIONAL_MINUTE_RATE);
        }
        
        System.out.println("Number of Minutes: " + totalMinutes);
        System.out.println("Number of Hours: " + hours);
        
        if(totalMinutes < 60){
             System.out.println("Additional minutes: 0");
        } else {
             System.out.println("Additional minutes: " + additionalMinutes);
        }
        System.out.println("Total price: $" + totalPrice);
    }
}