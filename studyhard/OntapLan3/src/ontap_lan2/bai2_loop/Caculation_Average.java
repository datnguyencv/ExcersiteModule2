package ontap_lan2.bai2_loop;

import java.util.Scanner;

public class Caculation_Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhât :");
        int numberFirst = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai :");
        int numberSecond = Integer.parseInt(scanner.nextLine());
        System.out.println("UCLN "+uocChungLonNhat(numberFirst,numberSecond));
        System.out.println("BCNN "+boiChungNhoNhat(numberFirst,numberSecond));
        int average = (uocChungLonNhat(numberFirst, numberSecond)
                + boiChungNhoNhat(numberFirst, numberSecond)) / 2;
        System.out.println("Trung Bình cộng UCLN ,BCNN là " + average);
    }

    public static int uocChungLonNhat(int a, int b) {
        int max = 0;
        if (a > b) {

            for (int i = 1; i <= b; i++) {
                if (b % i == 0) {
                    if (a % i == 0)
                        max = i;
                }
            }
            return max;
        }
        if (a < b) {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    if (b % i == 0)
                        max = i;
                }
            }
            return max;

        } else return a;
    }

    public static int boiChungNhoNhat(int a, int b) {
        int result;
        result = a * b / uocChungLonNhat(a, b);
        return result;
    }
}