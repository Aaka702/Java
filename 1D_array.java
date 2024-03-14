import java.util.Scanner;
class main
	{
	public static void main( String args[])
		{
		Scanner scanner = new Scanner(System.in);
		
		//Asking user to enter the input
		
		System.out.println("Enter the size of the arrray");
		int size=scanner.nextInt();
		//initializeing the elements in the array
		int[] numbers=new int[size];
		System.out.println("Enter"+size+"integers");
		for(int i=0;i<size;i++)
			{
			numbers[i]=scanner.nextInt();
			}
		System.out.println("The elements in the arrray");
		for(int i=0;i<size;i++)
			{
			System.out.println(numbers[i]);
			}
		scanner.close();
		}
	}
