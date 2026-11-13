import java.util.Scanner;
class Biggest{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a digit");
        char ch=sc.next().charAt(0);
        int ascii=(int) ch;
        System.out.println("Ascii value  +ascii");
    }
}