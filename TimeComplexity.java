import java.util.Scanner;
class TimeComplexity{
    public static void main(String [] args){
        int c=0,i;
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=no.nextInt();
        for(i=1;i<=n;i++){
            c=c^(i);
        }
        System.out.println(c);
    }
}