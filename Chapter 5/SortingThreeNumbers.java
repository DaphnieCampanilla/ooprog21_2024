import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input Three(3) Number");
        
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        
        System.out.print("Enter Third Number: ");
        int num3 = input.nextInt();

        int largest, smallest, middle;

        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }
 
        if (num1 <= num2 && num1 <= num3) {
            smallest = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            smallest = num2;
        } else {
            smallest = num3;
        }

        if (num1 != largest && num1 != smallest) {
            middle = num1;
        } else if (num2 != largest && num2 != smallest) {
            middle = num2;
        } else {
            middle = num3;
        }
         
        if ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3)) {
            System.out.println("Numbers in Ascending Order: " + smallest + ", " + middle + ", " + largest);
        } else {
            System.out.println("Numbers in Descending Order: " + largest + ", " + middle + ", " + smallest);
        }

        input.close();
    }
}

