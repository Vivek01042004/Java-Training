import java.util.Scanner;

class GREATEST{
    public static void main(String [] args){
        Scanner aa=new Scanner(System.in);
        System.out.print("Enter the number a:");
        int a=aa.nextInt();
        Scanner bb=new Scanner(System.in);
        System.out.print("Enter the number b:");
        int b=bb.nextInt();
        Scanner cc=new Scanner(System.in);
        System.out.print("Enter the number c:");
        int c=cc.nextInt();
        Scanner dd=new Scanner(System.in);
        System.out.print("Enter the number d:");
        int d=aa.nextInt();
        int l,min1,min2,f;
        min1=a>b?a:b>c?b:c;
        min2=c>d?c:d;
        f=min1>min2?min1:min2;
        System.out.print("The greatest number is:"+f);
    }
}