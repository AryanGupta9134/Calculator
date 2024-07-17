import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();

        System.out.print("Enter operation like ('+','-','*','/') : ");
        char operator = sc.next().charAt(0); 

        double result; 

        switch (operator) {
            case '+':
                result = a + b; 
                break;

            case '-':
                result = a - b; 
                break;

            case '*':
                result = a * b; 

            case '/':
                if(b != 0){
                    result = a / b;
                }else{
                    System.out.println("Error!!");
                    return; 
                }
                break; 
        
            default:
            System.out.println("Error: Invalid Operator!!");
                return;
        }
        System.out.println("Answer is : " + result);
    }
}
