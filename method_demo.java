 public class method_demo {
     String info_student(){
        String name="AISHWARYA";
        System.out.print(" the student name is: ");
        return name;
    }
    public static void main(String[] args) {
        method_withreturn a=new method_withreturn();
       System.out.print(a.info_student());

    }
}
