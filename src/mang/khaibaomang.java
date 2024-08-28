
package mang;
import java.util.Arrays;
public class khaibaomang {
     public static void main(String[] args){
         int[] numbers = {12, 49, -2, 5, 17, -6};
         for (int i = 0; i < numbers.length/2; i++) {
             int temp = numbers[i];
             numbers[i] = numbers[numbers.length - 1 - i];
             numbers[numbers.length - 1 - i] = temp;
         }
         System.out.print(" " + Arrays.toString(numbers));
     }
}
