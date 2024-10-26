import java.util.Scanner;
class Hii{
    public static void main(String[] args){
        Scanner aa= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a=aa.nextInt();
        Scanner bb= new Scanner(System.in);
        System.out.print("Enter the value of b:");
        int b=bb.nextInt();
        int c=a+b;
        System.out.println("a+b:"+c);

    }
}