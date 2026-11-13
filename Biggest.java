import java.util.Scanner;
class Biggest{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
System.out.println("enter three number");
 int a =sc.nextInt();
 int b=sc.nextInt();
 int c =sc.nextInt();
 if (a>=b&&a>=c)
 {
    System.out.println("a is biggest number");
 }
 else if(b>=a&&b>=c)
 {
    System.out.println("b is biggest number");
 }
 else
 {
    System.out.println("c is number");
 }
 if (a<=b&&a<=c)
 {
    System.out.println("a is smallest number +a");
 }
 else if(b<=a&&b<=c)
 {
    System.out.println("b is smallest number +b");
 }
 else
 {
    System.out.println("c is  smallest number +c");
 }
}
}