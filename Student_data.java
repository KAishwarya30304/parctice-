public class Student_data {
    int reg_num;
    String name;
    double marks;
    String department;
    void detail_display(){
        System.out.println(" student Name: "+name);
        System.out.println("Student Register Number:"+reg_num);
        System.out.println(" student Marks: "+marks);
        System.out.println(" student Department: "+name);
    }
    public static void main(String[] args) {
        Student_data stud_1=new Student_data();
        Student_data stud_2=new Student_data();
        Student_data stud_3=new Student_data();
        stud_1.name="aishu";
        stud_1.marks=100;
        stud_1.reg_num=3;
        stud_1.department="It";
        stud_1.detail_display();
        stud_2.name="mano";
        stud_2.marks=101;
        stud_2.reg_num=6;
        stud_2.department="cse";
        stud_2.detail_display();
        stud_3.name="priya";
        stud_3.marks=102;
        stud_3.reg_num=9;
        stud_3.department="house queen";
        stud_3.detail_display();

    }
}
