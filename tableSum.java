import java.util.*;
public class tableSum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        System.out.println("Table of "+n+":");
        for(int i=n;i<=20;i=i+2){
            System.out.println(i);
        }
        int sum=0;
        for(int i=n;i<=20;i=i+2){
            sum=sum+i;
        }
        System.out.println("Sum of table of "+n+":"+sum);
    }
}
