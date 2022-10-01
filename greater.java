import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class greater {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num1=25;
      System.out.println("Given number :"+num1);
      System.out.println("Enter number for comparison with given number :");
      int num2=sc.nextInt();
      if (num1>num2)
      System.out.println("Given number is greater");
      else if (num1==num2)
      System.out.println("Both numbers are equal");
      else 
      System.out.println("Entered number is greater");
    }
}
