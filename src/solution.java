import java.util.Arrays;

public class solution {


    public static void main(String[] args) {
        int[] numbers = {82, 24, 94, 22, 42};
        int result = sum(numbers);
        System.out.println("Sum of the numbers: " + result);


        int answer = largest(numbers);
        System.out.println("The largest number is: " + answer);


        int[] newArray = reverse(numbers);
        System.out.println("Our previous array was: " + Arrays.toString(numbers));
        System.out.println("Our reversed array is: " + Arrays.toString(newArray));

        int number= 5;
        long factorial = CalculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);

        //6.Palindrome check using char string

        String PalindromeChecker = "deleveled";
        boolean isPalindrome = CheckPalindrome(PalindromeChecker.toCharArray());

        if(isPalindrome){
            System.out.println( PalindromeChecker +": " + " yes! It's a palindrome");
        }
        else {
            System.out.println(PalindromeChecker + ": " + "NO! It's not a palindrome");
        }
    }


//BELOW CODES ARE METHODS

    //1.sum of the array
    public static int sum(int[] numbers) {


        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }


    // 2.largest element of the array
    public static int largest(int[] numbers) {
        int largest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }
        return largest;
    }

   /* //3.Finding Even or odd, counting as well

    public static int evenOdds(int[] numbers) {
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + "is even");
                evenCount++;
            }
            else {
                System.out.println(numbers[i] + "is odd");
              oddCount++;
            }

        }
        return
    }*/

    //4. Reverse the element of array.

    public static int[] reverse(int[] numbers){
        int[] reverseArray= new int[numbers.length];


           for(int i=0; i<reverseArray.length; i++){
               reverseArray[i] = numbers[numbers.length-1-i];
           }


        return reverseArray;
    }

    // 5. factorial using recursion

    public static long CalculateFactorial(int n){


        if(n==0|| n==1){
            return 1;
        }
        else {
            return n*CalculateFactorial(n-1);
        }

    }
    //6.Palindrome check using char string

    public static boolean CheckPalindrome(char[] input){
       int PalindromeStart = 0;
       int PalindromeEnd = input.length-1;
       while (PalindromeEnd>=PalindromeStart){

           char leftChar = Character.toLowerCase(input[PalindromeStart]);
           char rightChar = Character.toLowerCase(input[PalindromeEnd]);

           if (leftChar!= rightChar) {
               return false;

           }
           PalindromeStart++;
           PalindromeEnd--;
       }
       return true;
}

}



