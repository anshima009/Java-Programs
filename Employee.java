import java.util.*;
public class Employee {
    int salary;
    String name;
    
    String getName(){
        System.out.println("Enter the name of employee :");
        name=sc.nextLine();
        return name;
    }

    void setName(){
        System.out.println("Name of the employee :"+getName());
    }

    int getSalary()
    {
        System.out.println("Enter salary of Employee :");
        salary=sc.nextInt();
        return salary;
    }

    void setSalary()
    {
        System.out.println("Salary of employee :"+getSalary());
    }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        e.setName();
        e.setSalary();

    }
}
