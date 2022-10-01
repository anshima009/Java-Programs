import java.util.*;
public class detectSpaces {
    public static void main(String args[]){
       int count=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your string :");
       String s=sc.nextLine();
       int len=s.length();
       for (int i=0;i<len;i++)
       {
        if(s.charAt(i)==' ')
        count++;
       }
       if (count==2)
       System.out.println("Spaces are double");
       else if (count==3)
       System.out.println("Spaces are triple");
       else 
       System.out.println("Spaces are more");

    }
}
