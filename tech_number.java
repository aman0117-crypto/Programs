import java.lang.Math;
class  tech_number{
public  static void main(String []args){

int a=3025;
int b=a;
int count=0;
int rev=0;
while(a!=0){
int rem=a%10;
count++;
a=a/10;
}
System.out.println("The number of digits are: "+count);

int c=10;
int d=count/2;
int e=(int) Math.pow(c,d);
int  first=b/e;
int second=b%e;
System.out.println(first);
System.out.println(second);

int g=first+second;
int h=g*g;
if(h==b){
System.out.println("Tech  number");
}
else{
System.out.println("not Tech  number");
}


}
}