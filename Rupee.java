import java.util.Scanner;
public class Rupee {
    public static void main(String[] args){
        Scanner inr=new Scanner(System.in);
        System.out.println("Enter the rupees: ");
        float rup=inr.nextLong();
        float dollar=rup/64;
        System.out.println("In USD: "+dollar);
    }
}
