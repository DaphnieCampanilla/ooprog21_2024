class MathTest {
   public static void main (String[] args) {
      double num1 = 37;
      double num2 = 22.7;
      int num3 = 71;
      int num4 = 68;
      double randomValue = Math.random();
      
      System.out.println("SQRT: " + Math.sqrt(num1));
      System.out.println("SIN: " + Math.sin(num1));
      System.out.println("COS: " + Math.cos(num1));
      System.out.println("FLOOR: " + Math.floor(num2));
      System.out.println("CEIL: " + Math.ceil(num2));
      System.out.println("ROUND: " + Math.round(num2));
      System.out.println("MAX: " + Math.max (num3, num4));
      System.out.println("MIN: " + Math.min (num3, num4));
      System.out.println("RANDOM: " + randomValue);
   }
}