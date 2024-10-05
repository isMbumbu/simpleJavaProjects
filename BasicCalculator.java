import java.util.Scanner;
class BasicCalculator{
    double num1;
    double num2;
    char operator;
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    BasicCalculator values=new BasicCalculator();
    System.out.println("Input the first value");
    values.num1=scanner.nextDouble();
    System.out.println("Input the second value");
    values.num2=scanner.nextDouble();
    System.out.println("Input the operator: (/,+,*,-,%)");
    values.operator=scanner.next().charAt(0);
    switch(values.operator){
        case '+':
        System.out.println(values.num1+values.num2);
        break;
        case '/':
        if(values.num2!=0){
        System.out.println(values.num1/values.num2);
    }else{System.out.println("Cannot divide by 0");}
        break;
        case '-':
        System.out.println(values.num1-values.num2);
        break;
        case '*':
        System.out.println(values.num1*values.num2);
        break;
        case '%':
        System.out.println(values.num1%values.num2);
        break;
        default:
        System.out.println("Enter a valid operator");

    }

scanner.close();
}
}