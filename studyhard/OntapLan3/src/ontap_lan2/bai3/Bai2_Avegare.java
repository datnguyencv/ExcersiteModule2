package ontap_lan2.bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2_Avegare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length=Integer.parseInt(scanner.nextLine());
        int [] arrNum = new int[length];
        int number;
        for (int i = 0; i < length; i++) {
            System.out.print("Nhập vào phần tử "+i+ " là " );
            arrNum[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng đã nhập" + Arrays.toString(arrNum));
        averageOdd(arrNum);
    }

    public static void averageOdd(int [] arr){
        int count=0,sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i%2!=0){
                count++;
                sum+=arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println("Trung Bình công vị trí lẻ "+sum/count);
    }


}
