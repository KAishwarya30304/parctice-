import java.util.Scanner;
public class find_grater {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for A: ");
        int a=scanner.nextInt();
        System.out.println("Enter value for B: ");
        int b=scanner.nextInt();
        System.out.println("Enter value for C: ");
        int c=scanner.nextInt();
        if(a>b&&a>c){
            System.out.println("A is grater");
        }else if(b>c){
            System.out.println("B is grater");
        }else{
            System.out.println("C is grater");
        }
    }
}
