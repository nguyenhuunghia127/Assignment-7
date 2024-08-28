
package mang;

import java.util.Scanner;


public class weather {
    public static void main(String[] args){
         Scanner console = new Scanner(System.in);
         System.out.print("how many day's temperature? ");
         int days = console.nextInt();
         int[] temps = new int[days];
         int sum = 0;
         for (int i = 0; i < days; i++){
             System.out.print("day "+ (i + 1) + "'s high temp: ");
             temps[i] = console.nextInt();
             sum += temps[i];
         }
         double average = (double) sum / days;
         int count = 0;
         for (int i = 0; i < days; i++){
             if (temps[i] > average){
                 count++;
             }
         }
         System.out.printf("average temp = %.1f", average);
         System.out.println();
         System.out.println(count + "day above average");
     }
    
}
