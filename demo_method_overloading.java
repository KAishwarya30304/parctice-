public class demo_method_overloading {
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a ,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        demo_method_overloading addition=new demo_method_overloading();
        System.out.println(addition.add(10,20));
        System.out.println(addition.add(10,20,30));

    }
}
