import java.util.Scanner;
class Range{
    public static void main(String [] args){
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=no.nextInt();
        if(n>=1 && n<=50){
            System.out.println("The number is in range 1<=n<=50");
        }
        else if(n>=51 && n<=100){
            System.out.println("The number is in range 51<=n<=100");
        }
        else if(n>=101 && n<=150){
            System.out.println("The number is in range 101<=n<=150");
        }
        else if(n>=151 && n<=200){
            System.out.println("The number is in range 151<=n<=200");
        }
        }
}