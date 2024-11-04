import java.util.Scanner;
class ReverseNo{
    public static  void main(String [] args){
        int rem,rev=0,org;
        Scanner no= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=no.nextInt();
        org=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}