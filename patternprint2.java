import java.util.*;;
public class patternprint2 {
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter number of lines :");
       int n=sc.nextInt();
       System.out.println("Pattern is as follows ");
       pattern(n);

    } 
}
