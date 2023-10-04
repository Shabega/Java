import java.util.Scanner;
public class Greeting {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.print("Enter the name:");
        String nm=name.next();
        System.out.println("Greeting "+nm+" Hello welcome");
    }
}
