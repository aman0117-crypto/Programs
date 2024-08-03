public class character_type {
    public static void main(String[] args) {
        char ch='#';

        if(ch>=65 && ch<=90){
            System.out.println("uppercase characater..");
        }
        else if(ch>=97 && ch<=122){
            System.out.println("lowercase characater..");
        }
        else if(ch>=48 && ch<=57){
            System.out.println("number");
        }
        else if(ch>=32 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126){
            System.out.println("special characters");
        }
    }
    
}
