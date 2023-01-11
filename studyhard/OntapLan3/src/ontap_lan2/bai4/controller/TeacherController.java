package ontap_lan2.bai4.controller;

import Student.ontap_lan2.bai4.model.Teacher;
import Student.ontap_lan2.bai4.service.IServiceTeach;
import Student.ontap_lan2.bai4.service.NumFormatException;
import Student.ontap_lan2.bai4.service.ServiceTeacherImpl;

import java.util.Scanner;

public class TeacherController {
    public static IServiceTeach iServiceTeach = new ServiceTeacherImpl();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("------Teacher manager------");

            System.out.println("1. Add Teacher\n" +
                    "2. Display Teacher\n" +
                    "3. Exit");
            int choise=0;
            try {
                System.out.println("Nhap lua chon ");
                choise =Integer.parseInt(scanner.nextLine()) ;

            }catch (NumberFormatException e){
                System.err.println("Vui lòng nhập lại số ");
            }
                switch (choise) {

                    case 1:
                        System.out.println("Mời bạn nhập vào thông tin giảng viên: ");
                        System.out.println("Nhập tên ");
                        String name = scanner.nextLine();
                        System.out.println("Nhập tuổi ");
                        String yearOld =scanner.nextLine();
                        System.out.println("Nhập địa chỉ ");
                        String address = scanner.nextLine();
                        System.out.println("Nhập email ");
                        String email = scanner.nextLine();
                        System.out.println("Nhập số điện thoại ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println("Nhập lớp đang dạy ");
                        String className = scanner.nextLine();
                        iServiceTeach.addTeach(new Teacher(name, yearOld, address, email, phoneNumber, className));
                        iServiceTeach.display();
                        break;

                    case 2:
                        iServiceTeach.display();
                        break;
                    case 3:
                        System.out.println("Cảm ơn đã sử dụng chương trình ");
                        System.exit(0);

                        break;
                    default:
                        System.out.println("Mơ bạn nhập lại lựa chọn");
                }


        } while (true);
    }
}
