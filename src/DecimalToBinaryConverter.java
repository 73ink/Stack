import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main (String[] args) {
        int[] numbers = {0, 1, 5, 10, 15, 25}; // 6 different decimal numbers to convert to binary
        // output prints based on the case
        for (int number : numbers) {
            System.out.println("Decimal number: " + number);
            System.out.println("Binary number: " + decimalToBinary(number));
            System.out.println("--------------------");
        }
    }
        public static String decimalToBinary(int num){
        return "0";
        }

}
