package ontap_lan2.bai4.model;

public class Teacher {
    private String nameTeacher;
    private String tuoi;
    private String address;
    private String email;
    private String phoneNumber;
    private String classTeach;

    public Teacher() {
    }

    public Teacher(String nameTeacher, String tuoi, String address, String email, String phoneNumber, String classTeach) {
        this.nameTeacher = nameTeacher;
        this.tuoi = tuoi;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.classTeach = classTeach;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getClassTeach() {
        return classTeach;
    }

    public void setClassTeach(String classTeach) {
        this.classTeach = classTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" + "nameTeacher='" + nameTeacher + '\'' + ", tuoi=" + tuoi + ", address='" + address + '\'' + ", email='" + email + '\'' + ", phoneNumber='" + phoneNumber + '\'' + ", classTeach='" + classTeach + '\'' + '}';
    }
}
