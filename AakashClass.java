package mypack;
import java.util.*;
class AakashClass {
	public static void main(String[] args) {
	{
		System.out.println("This is my pacakge!");
		}
		Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the first number:");
		 int num1 = scanner.nextInt();
		 
		 System.out.println("Enter the second number:");
		 int num2 = scanner.nextInt();
		 
		 scanner.close();
		 int result = num1*num2;
		 
		 System.out.println("The result of multiplying "+num1+"and "+num2+" is"+result);
		 }
	}
