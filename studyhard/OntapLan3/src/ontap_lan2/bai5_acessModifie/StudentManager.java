package ontap_lan2.bai5_acessModifie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    public static List<StudentAccessModifier> studentAccessModifier = new ArrayList<>();
    public static final String CHECK = "^[C][0-9]{2}[2]\\d{1}(G1)$";
    public static boolean isValidateClass(String str) {
        return str.matches(CHECK);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào thông tin Học viên ");
        System.out.println("Họ và tên  ");
        String name = scanner.nextLine();
        System.out.println("Tuổi  ");
        int yearOld = Integer.parseInt(scanner.nextLine());
        String nameClass;
        do {
            System.out.println("Lớp  ");
            nameClass = scanner.nextLine();
        } while (!isValidateClass(nameClass));
        studentAccessModifier.add(new StudentAccessModifier(name,yearOld,nameClass));
        System.out.println(studentAccessModifier);
    }
}
