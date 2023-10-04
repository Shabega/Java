import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the operator: ");
            char ch =sc.next().trim().charAt(0);
            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                System.out.print("Enter two numbers: ");
                int num1=sc.nextInt();
                int num2=sc.nextInt();
                if(ch=='+'){
                    ans=num1+num2;
                }
                if(ch=='-'){
                    ans=num1-num2;
                }
                if(ch=='*'){
                    ans=num1*num2;
                }
                if(ch=='/'){
                    if(num2!=0){
                        ans=num1/num2;
                    }
                    else{
                        break;
                    }
                }
                if(ch=='%'){
                    ans=num1%num2;
                }
            } else{
                System.out.println("Enter valid operator");
            }
            System.out.println(ans);  
        }
        
    }
}