public class Triangle {

    public static void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("T");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 7;
        
        printTriangle(height);
    }
}