import java.util.*;
public class Percentage {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of physics : ");
        float physics=sc.nextFloat();
        System.out.println("Enter marks of chemistry : ");
        float chemistry=sc.nextFloat();
        System.out.println("Enter marks of english : ");
        float eng=sc.nextFloat();
        System.out.println("Enter marks of maths : ");
        float maths=sc.nextFloat();
        System.out.println("Enter marks of sanskrit : ");
        float sans=sc.nextFloat();
        System.out.println("Maths : " +maths);
        System.out.println("Chemistry : " +chemistry);
        System.out.println("Physics : " +physics);
        System.out.println("English : " +eng);
        System.out.println("Sanskrit : " +sans);
        float percentage=(maths+eng+physics+chemistry+sans)/5;
        System.out.println("Percentage of a student who obtained above marks : " +percentage+"%");
    }
}
