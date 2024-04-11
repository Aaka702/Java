import java.util.Scanner;
interface shape
{
	public void rectangle(int l, int b);
	public void square(int side);
}
class Area implements shape
{
	public void rectangle(int l, int b)
	{	
	int area = l * b;
		System.out.println("find our the area of the rectangle"+area);
	}
	public void square(int side)
	{
	int area1 = side*side;
		System.out.println("Area of the square"+area1);
	}
}
class sqmtr 
{	
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	Area myArea = new Area();
	System.out.println("Enter the lenght of the recttangle");
	int l = s.nextInt();
	System.out.println("Enter the breadth of the rectangle");
	int b = s.nextInt();
	System.out.println("Enter the sides of the square");
	int side = s.nextInt(); 
		myArea.rectangle(l,b);
		myArea.square(side);
	s.close();
	}
}
