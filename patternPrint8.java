import java.util.*;
public class patternPrint8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of lines :");
       int n=sc.nextInt();
       for (int i=2;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
       }
    }
}
