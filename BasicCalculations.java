
package basiccalculations;

import java.util.Scanner;
public class BasicCalculations {
    
    public static void main(String[] args) {
        Scanner calculations = new Scanner(System.in);
    double num1,num2,ans1,ans2,ans3,ans4,ans5;
        System.out.println("Enter first num:");
        num1= calculations.nextDouble();
        System.out.println("Enter second num:");
        num2 = calculations.nextDouble();
        ans1 = num1+num2;
        ans2 = num1-num2;
        ans3 = num1*num2;
        ans4 = num1/num2;
        ans5 = num1%num2;
        System.out.println(" ");
        System.out.println("Answers are:");
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
        System.out.println(ans5);
    }
    
}
