import java.util.*;
public class sumEven {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        int i=0,sum=0;
        while(i<=n){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("Sum of n even numbers :"+sum);
    }
}

