package ontap_lan2.bai2_loop;

import java.util.Scanner;

public class SumDivNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần tính: ");
        int numberInput = scanner.nextInt();
        sumDiv(numberInput);
    }

    public static void sumDiv(int n) {
        int resurtSum = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    resurtSum += i;
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println("Tổng các ước số: "+resurtSum);
    }
}
