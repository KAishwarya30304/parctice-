import java.util.Scanner;
public class demo_ifelseif {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a marks:");
        int marks=scanner.nextInt();
        if(marks<=50){
            System.out.println("Student is fail");
        }else if(marks>=51 && marks<=70){
            System.out.println("Average student");
        }else {
            System.out.println("Good performance.");
        }
    }
}
