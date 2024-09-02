import java.util.Scanner;

public class CarlysEventPrice {
    public static void main (String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println ("***************************************");
        System.out.println ("* Carly's makes the food that makes  *");  
        System.out.println ("*           it a party.               *"); 
        System.out.println ("***************************************\n");
        
        final int PRICE_PER_PERSON = 35;
        final int LARGE_EVENT = 50;
        
        
        System.out.print("Number of guests: ");
        int numberOfGuests = in.nextInt();
        
        int totalPrice = numberOfGuests * PRICE_PER_PERSON;
        
        System.out.println("\nNumber of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        
        if (numberOfGuests >= 50) {
           System.out.println("Is this a Large Event? True");
        } else {
            System.out.println("Is this a Large Event? False");
    
       }
       
        in.close();
    } 
}