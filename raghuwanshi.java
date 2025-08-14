public class SwapNumbersTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        int temp = a; // Store the value of 'a' in 'temp'
        a = b;        // Assign the value of 'b' to 'a'
        b = temp;     // Assign the value from 'temp' (original 'a') to 'b'

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}