import java.util.Scanner;
public class demo_if {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("Given number is even.");
        }

    }
}
