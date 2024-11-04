import java.util.Scanner;
class Optimizedtimecomplexity{
    public static void main(String [] args){
        int c=0,i;
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=no.nextInt();
        if(n%4==1) System.out.println(1);
        if(n%4==2) System.out.println(n+1);
        if(n%4==3) System.out.println(0);
        if(n%4==0) System.out.println(n);
    }

}