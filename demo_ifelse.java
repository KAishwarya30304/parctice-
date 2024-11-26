import java.util.Scanner;
public class demo_ifelse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age:");
        int age =scanner.nextInt();
        if(age>=18){
            System.out.println("eligiable for vote.");
        }else{
            System.out.println("not eligiable.");
        }
    }
}
