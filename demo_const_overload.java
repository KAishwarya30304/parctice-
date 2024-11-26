public class demo_const_overload {
    String name;
    demo_const_overload(int s_no){
        System.out.println("Serial number is:"+s_no);
        System.out.println("hello");
    }
    demo_const_overload(int roll_num,String name){
        this.name=name;
        System.out.println("Name is:"+name);
        System.out.println("Student register number is:"+roll_num);
    }
    public static void main(String[] args) {
        new demo_const_overload(1);
        demo_const_overload c=new demo_const_overload(10,"Aishu");

    }
}
