import java.util.Scanner;
public class fabinacci {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=scanner.nextInt();
        int frist=0,second=1;

    for(int i=1;i<num;i++) {
        int next = frist + second;
        frist = second;
        second = next;


    }
        System.out.print(frist+" ");
    }


}
