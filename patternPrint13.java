import java.util.*;
public class patternPrint13 {
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        for (char i='A';i<='E';i++){
         for(char j='A';j<=i;j++){
             System.out.print((j));
         }
         System.out.println();
        }
     }
}
