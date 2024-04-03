//program to add two complex numbers in java
import java.util.Scanner;

class Complex
{
	double real, imaginary;

	Complex(double r, double i) 
	{
		this.real =r;
		this.imaginary = i;
	}
	
	public Complex add(Complex other)
	{
		double newReal = this.real + other.real;
		double newImaginary = this.imaginary + other.imaginary;
		return new Complex(newReal, newImaginary);
	}
	
	public String toString() 
	{
		return "(" + real + "+" + imaginary + "i)";
	}
}

public class ComplexAddition 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the real part of the first complex number:");
		double real = scanner.nextDouble();
		
		System.out.println("Enter the imaginary part of the first complex number:");
		double imaginary = scanner.nextDouble();
		
		System.out.println("Enter the real part of the second complex number");
		double real2 = scanner.nextDouble();
		
		System.out.println("Enter the imaginary part of the second complex number:");
		double imaginary2 = scanner.nextDouble();
		
		Complex num1 = new Complex(real,imaginary);
		Complex num2 = new Complex(real2,imaginary2);
		
		Complex sum = num1.add(num2);
		System.out.println("Sum is :" +sum);
		scanner.close();
	}
}
