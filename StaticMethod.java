public class StaticMethod {
    private int rollno;
    private  String name;
    private static String college = "BBDIT";

    // Hàm để khởi tạo biến.
    StaticMethod(int r, String n){
        rollno = r;
        name = n;
    }

    // Phương thức tĩnh để thay đổi giá trị của biến tĩnh.
    static void change(){
        college = "CODEGYM";
    }

    // Phương thức hiển thị giá trị.
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

class TestStaticMethor {
    public static void main(String[] args) {
        StaticMethod.change(); // gọi thay đổi phương thức.

        // Tạo đối tượng.
        StaticMethod s1 = new StaticMethod(111, "Hoàng");
        StaticMethod s2 = new StaticMethod(222, "Khanh");
        StaticMethod s3 = new StaticMethod(333, "Nam");

        // Gọi phương thức hiển thị.
        s1.display();
        s2.display();
        s3.display();
    }
}
