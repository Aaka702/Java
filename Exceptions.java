public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] myNumber = {1, 2, 3, 4};
            System.out.println(myNumber[10]); // Accessing index out of bounds
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }
}

