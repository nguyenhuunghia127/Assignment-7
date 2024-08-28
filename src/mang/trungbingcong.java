
package mang;

import java.util.Scanner;

public class trungbingcong {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap so luong mang ");
        int so = nhap.nextInt();
        int[] num = new int[so];
        int sum = 0;
        for(int i=0;i<num.length;i++){
            System.out.print("nhap so thu "+(i + 1)+" la :");
            num[i]=nhap.nextInt();
            sum+=num[i];
        }
        double average = (double) sum / so;
        System.out.print("average : " + average);
    }
}
