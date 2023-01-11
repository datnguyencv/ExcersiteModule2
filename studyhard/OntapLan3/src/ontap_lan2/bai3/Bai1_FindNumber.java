package ontap_lan2.bai3;

import java.util.Scanner;

public class Bai1_FindNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên cần tìm ");
        int number = scanner.nextInt();
        System.out.println("Vị trí xuất hiện số cần tìm cuối cùng "+findNumber(number));
    }

    public static int findNumber(int number){
        int [] arrNum = {1,2,3,4,5,6,2,8,9,0};
        int index=0;
        for (int i = 0; i < arrNum.length; i++) {
            if (arrNum[i]==number){
                index=i;
            }
        }
        return index;
    }
}
