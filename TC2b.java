import java.util.Scanner;
public class TC2b{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l=scanner.nextInt();
        int r=scanner.nextInt();
        int a=XOR(r);
        int b=XOR(l-1);
        System.out.println(a^b);
    }
    public static int XOR(int n){
        if(n%4==1) return 1;
        if(n%4==2) return n+1;
        if(n%4==3) return 0;
        return n;
    }
}