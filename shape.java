import java.util.Scanner;
public class shape {
    static double length;
    static double breath;
    static void display_l_b(){
        System.out.println(" length is:"+ length);
        System.out.println("breath is:"+ breath);

    }
    static void area_cal(){
        double area=length*breath;
        System.out.println(" The area of the room is: "+ area);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        shape s_1=new shape();
        s_1.breath=scanner.nextInt();
        s_1.length=scanner.nextInt();
        s_1.display_l_b();
        s_1.area_cal();
        area_cal();
    }
}
