import java.util.Scanner;
public class SI {
    public static void main(String[] args){
        Scanner simple=new Scanner(System.in);
        System.out.print("Enter the Principle Amount:");
        float Principle =simple.nextFloat();
        System.out.print("Enter the Number of Year:");
        int Year=simple.nextInt();
        System.out.print("Enter the Rate of Interest:");
        int Rate=simple.nextInt();
        float SimpleInterest = (Principle*Year*Rate)/100;
        System.out.println("The SimpleInterest is "+ SimpleInterest);
        
    }
    
}

