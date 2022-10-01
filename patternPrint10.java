import java.util.*;
public class patternPrint10 {
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            count++;
             System.out.print(count);
             
         }
         System.out.println();
        }
     }
}
