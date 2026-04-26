import java.util.Stack;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        int[] nums = {0, 1, 5, 10, 15, 45}; // 6 different decimal numbers to convert to binary
        // output prints based on the case
        for (int num : nums) {
            System.out.println("Decimal number: " + num);
            System.out.println("Binary number: " + decimalToBinary(num));
            System.out.println("--------------------");
        }
    }
    // please note that I've used this site as a learning material for decimal & binary: https://beginnersbook.com/2014/07/java-program-to-convert-decimal-to-binary/
    public static String decimalToBinary(int num) {
        // if number is 0, binary is also 0
        if (num == 0) {
            return "0";
        }
        // create a stack to store remainders
        Stack<Integer> remainders = new Stack<>();
        // keep dividing the number by 2
        while (num >0){
            // get remainder 0 or 1
            int reminder = num % 2;
            // push remainder into stack
            remainders.push(reminder);
            // update number divide by 2
            num = num /2;
        }
        // create empty string to store final binary result
        String binary ="";
        // pop all elements from stack which will reverses the order
        while (!remainders.isEmpty()){
            binary = binary + remainders.pop();
        }
        // finally, return final binary string
        return binary;

    }
}
