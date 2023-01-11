package ontap_lan2.bai4.service;

import Student.ontap_lan2.bai4.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class ServiceTeacherImpl implements IServiceTeach{

    static List<Teacher> teacherList = new ArrayList<>();
    static {
        teacherList.add(new Teacher("Thanh Cong","32","Đà Nẵng","thanhcong@codegym.vn","0987877878","C1122G1"));
        teacherList.add(new Teacher("Thanh Cong","32","Đà Nẵng","thanhcong@codegym.vn","0987877878","C1122G1"));
        teacherList.add(new Teacher("Thanh Cong","32","Đà Nẵng","thanhcong@codegym.vn","0987877878","C1122G1"));
    }

    @Override
    public void addTeach(Teacher teacher) {
        teacherList.add(teacher);

        }


    @Override
    public void display() {
        for (int i=0;i<teacherList.size();i++){
            teacherList.get(i);
        }
        System.out.println(teacherList);

    }
}
