import java.util.*;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num =sc.nextInt();
        int org_num=num;
        int rev =0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println("The reverse number is "+rev);
        if(org_num==rev){
            System.out.println("The given number is palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    }    
}
