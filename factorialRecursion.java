import java.util.*;
public class factorialRecursion {

    static int fact(int n)
    {
        if(n==1)
        return 1;
        else
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        int facto=fact(n);
        System.out.println("Factorial of "+n+" using recursion :"+facto);
    }
}
