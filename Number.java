import java.util.Scanner;
public class Number{
    public static void main(String[] args){
        Scanner num =new Scanner(System.in); 
        System.out.print("Enter the Number: ");
        int number = num.nextInt();
        if(number%2==0){
            System.out.print("The number "+number+" is Even");
        }
        else{
            System.out.print("The number " +number+" is odd");
        }
    }
}