import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Demoscanner {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter integer: ");
        int num=scn.nextInt();
        System.out.println(num);
    }
}
