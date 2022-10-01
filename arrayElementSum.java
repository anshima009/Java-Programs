import java.util.*;
public class arrayElementSum {
    public static void main(String args[]) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array :");
        for (int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of entered elements :");
        int sum=0;
        for (int i=0;i<5;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
