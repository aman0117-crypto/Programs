import java.util.Scanner;
public class Prime_num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int count=0;
        if(n==2){
            System.out.println("prime number..");
        }
        else{
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println("prime number");
            }
            else{
                System.out.println("not prime number");
            }
        }
    }

}