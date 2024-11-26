import java.util.Scanner;
public class prime_num {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  a Number: ");
        int num=scanner.nextInt();
        boolean isprime=true;
        if(num<=1){
            isprime=false;
        }else{
        for(int i=2;i<num/2;i++) {
            if (num % i == 0) {
                isprime = false;
            }
        }
        }if(isprime){
            System.out.println("Is a prime number");

        }else{
            System.out.println("Is not a prime number");
        }
    }
}
