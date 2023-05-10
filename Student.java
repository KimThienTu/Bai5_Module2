public class Student {
    private String name;
    private String classes;

    public Student() {
        this.name = "John";
        this.classes = "C02";
    }

    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public String getName(){
        return this.name;
    }

    public String getClasses(){
        return this.classes;
    }

}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Tom");
        student.setClasses("C03");
        System.out.println("Tên sinh viên : "+ student.getName());
        System.out.println("Lớp của sinh viên: " + student.getClasses());
    }
}
