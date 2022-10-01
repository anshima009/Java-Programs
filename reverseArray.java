import java.util.*;
public class reverseArray {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array :");
        int n=sc.nextInt();
        int j=n;
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("Enter elements of array :");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<5;i++)
        {
            b[j-1]=a[i];
            j=j-1;
        }
        System.out.println("Reverse array :");
        for(int i=0;i<5;i++)
        {
            System.out.println(b[i]);
        }


    }

}
