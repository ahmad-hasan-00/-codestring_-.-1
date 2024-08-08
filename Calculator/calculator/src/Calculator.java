import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
	double num1 , num2;
	char operator;
	 
	System.out.println("welcome to the calculator!");
	
	//input for 1st number
	System.out.println("Enter The First Number:");
	num1 =scanner.nextDouble(); //user input of first number
	
	//input for the operator
	System.out.println("Enter Operator(+ , - , * ,/):");
	operator= scanner.next().charAt(0);   //user input of the operation that user wants to perform
	
	//Input for 2nd Number
	System.out.println("Enter The Second number:");
	num2= scanner.nextDouble();
	
	double result =0;  //for displaying rseult of the operation
	
	switch (operator) {
	case'+'://for addition
	result = num1 +num2;
	break;
	
	case'-': //for subtraction
		result= num1-num2;
		break;
	
	case'*' :// For Multiplication
	   result = num1*num2;
	  break;
	  
	case '/': 
		if (num2==0) { //code for avoiding Infinity problem ,so that the denominator can't be zero 
			System.out.println("Error: Division by 0 is not allowed");
		    return;
		}
	   result =num1 /num2;//For Division
	   break;
	 default:
		 System.out.println("Invalid Operator!");
		 return;
	}
	System.out.println("The Result Is:"+result);
	
	}
}
