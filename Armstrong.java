import java.util.*;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num=sc.nextInt();
        int res=0,rem=0;
        int org_num=num;
        while(num!=0){
            rem=num%10;
            res+=Math.pow(rem,3);
            num=num/10;
        }
        System.out.println("The number is: "+res);
        if(org_num==res){
            System.out.println("The number is Armstrong number");
        }
        else{
            System.out.println("The number is not Armstrong number");
        }
    }
}
