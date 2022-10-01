import java.util.*;
public class kilometerTomiles {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value in kilometers :");
        float km=sc.nextFloat();
        double miles=0.621*km;
        System.out.println("Value in miles will be :"+miles);
    }
}
