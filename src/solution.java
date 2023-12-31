public class solution {


    public static void main(String[] args) {
        int[] numbers = {82, 24, 94, 22, 42};
        int result = sum(numbers);
        System.out.println("Sum of the numbers: " + result);
    }


    public static int sum(int[] numbers) {


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

}



