import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

        for(int i=n-1;i>=1;i--){
            n=i*n;
        }
        System.out.println(n);
    }
    
}
