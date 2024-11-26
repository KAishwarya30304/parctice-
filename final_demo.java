public class final_demo {
    final int a;
    final static int b;
    {
        a=10;
    }
    static {
        b=20;
    }
    public void sample(){
        System.out.println(a);
        System.out.println(b);

    }
    public static void main(String[] args) {
        final int c;
        c=30;
        System.out.println(c);
        final_demo sm=new final_demo();
        sm.sample();

    }
}
