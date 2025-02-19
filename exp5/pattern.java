import java.util.*;
public class pattern {
     // Method to print the pattern
     static void qwer(int n) {
      for (int i = 0; i < n; i++) { 
          for (int j = 0; j < n; j++) { 
              System.out.print("*"); }
          System.out.println(); 
      }
  }

  public static void main(String[] args) {
      Scanner df = new Scanner(System.in);
      System.out.print("square pattern: ");
      int n = df.nextInt(); 
      qwer(n); 
      
  }
}
