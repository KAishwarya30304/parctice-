import java.util.Scanner;
public class check_pos {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number for checking its a positive:");
        int num=scanner.nextInt();
        boolean ispos=num>=0;
        if(ispos){
            System.out.println("Its a positive number");
        }else{
            System.out.println("Not a positive digit.");
        }
    }
}

