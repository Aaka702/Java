import java.util.Scanner;

class StaticandNonStatic{
    String name;
    float mark;
    int rollno;
    
    void show() {
        System.out.println("This is a non-static method");
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Mark: " + mark);
        System.out.println("Roll No: " + rollno);
    }
    
    static void showStatic() {
        System.out.println("This is a static method");
    }
    
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            StaticandNonStatic obj = new StaticandNonStatic(); // Added semicolon
            
            System.out.println("Enter the roll no:");
            obj.rollno = sc.nextInt();
            
            System.out.println("Enter the name:");
            obj.name = sc.next();
            
            System.out.println("Enter the mark:");
            obj.mark = sc.nextFloat();
            
            obj.show();
            showStatic(); // Fixed method name
            sc.close(); // Changed 's' to 'sc'
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

