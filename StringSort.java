import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		try{
		
			System.out.println("Enter the number of strings");
			int n = scanner.nextInt();
		
			scanner.nextLine();
		
			String[] strings = new String[n];
		
			System.out.println("Enter the string:");
			for(int i = 0; i<n;i++) {
			strings[i] = scanner.nextLine();
			}
			
			Arrays.sort(strings);
		
			System.out.println("Sorted array:");
			for(String str: strings){
				System.out.println(str);
			}
		}	
		catch(Exception e)
		{
		System.out.println("An error occured. Please make sure you entered value us correct");
		}
		finally{
		scanner.close();
		}
		
	}
}
