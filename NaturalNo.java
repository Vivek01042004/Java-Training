import java.util.Scanner;
class NaturalNo{
    public static void main(String [] args){
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the Nth number:");
        int n=no.nextInt(); 
        int i=1;
        while(i<=n){
            System.out.print(" "+i);
            i+=1;

        }

    }
}