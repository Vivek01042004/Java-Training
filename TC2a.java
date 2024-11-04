import java.util.Scanner;
class TC2a{
    public static void main(String [] args){
        int c=0,i;
        Scanner lo= new Scanner(System.in);
        System.out.print("Enter the number L:");
        int l=lo.nextInt();
        Scanner uo= new Scanner(System.in);
        System.out.print("Enter the number U:");
        int u=uo.nextInt();
        for(i=l;i<=u;i++){
            c=c^(i);
        }
        System.out.println(c);
    }
}