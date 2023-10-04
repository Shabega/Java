import java.util.Scanner;
public class Grtnum {
    public static void main(String[] args){
        Scanner num=new Scanner(System.in);
        System.out.print("Enter Two Numbers: ");
        int a=num.nextInt();
        int b=num.nextInt();
        if(a>b){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }
    }
}
