import java.util.Scanner;
public class Operators {
    public static void main(String[] args){
        Scanner calc=new Scanner(System.in);
        System.out.print("Enter num_1: ");
        int num_1=calc.nextInt();
        System.out.print("Enter num_2: ");
        int num_2= calc.nextInt();
        System.out.println("Enter the operation you want to perform (+,-,*,/,%)");
        char operations = calc.next().charAt(0);
        int ans=0;
        if(operations=='+'){
            ans= num_1+num_2;
        }
        else if(operations=='-'){
            ans=num_1-num_2;
        } 
        else if(operations=='*'){
            ans=num_1-num_2;
        } 
        else if(operations=='/'){
            ans=num_1-num_2;
        } 
        else if(operations=='%'){
            ans=num_1-num_2;
        } 
        System.out.println("The answer is "+ans);
    }
    
}
