package ontap_lan2.bai5_acessModifie;

public class StudentAccessModifier {
    private String name;
    private int yearOld;
    private String className;

    public StudentAccessModifier() {
    }

    public StudentAccessModifier(String name, int yearOld, String className) {
        this.name = name;
        this.yearOld = yearOld;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "StudentAccessModifier{" +
                "name='" + name + '\'' +
                ", yearOld=" + yearOld +
                ", className='" + className + '\'' +
                '}';
    }

}


