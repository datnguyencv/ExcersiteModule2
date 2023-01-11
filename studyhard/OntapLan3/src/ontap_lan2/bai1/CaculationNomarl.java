package ontap_lan2.bai1;

import java.util.Scanner;

public class CaculationNomarl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhât ");
        int numFirst= scanner.nextInt();
        System.out.println("Nhập số thứ nhât ");
        int numSecond= scanner.nextInt();
        System.out.println("Chọn phép tính :\n" +
                "1. Cộng\n" +
                "2. Trừ\n" +
                "3. Nhân\n" +
                "4. Chia");
        int choise;
        choise= scanner.nextInt();
        switch (choise){
            case 1:
                System.out.println("Kết quả : "+(numFirst+numSecond));
                break;
            case 2:
                System.out.println("Kết quả : "+(numFirst-numSecond));
                break;
            case 3:
                System.out.println("Kết quả : "+(numFirst*numSecond));
                break;
            case 4:
                System.out.println("Kết quả : "+(numFirst/numSecond));
                break;
            default:
                System.out.println("Cảm ơn bạn đã sử dụng dịch vụ");
        }
    }
}
