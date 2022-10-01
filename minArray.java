import java.util.*;
public class minArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter elements of array :");
        for (int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0];
        for(int i=1;i<5;i++){
            if(a[0]>a[i]){
            min=a[i];
            }
        }
        System.out.println("Minimum element in array :"+min);
    }
}
