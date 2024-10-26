import java.util.Scanner;
class LeapYr{
    public static void main(String [] args){
        Scanner yy=new Scanner(System.in);
        System.out.print("Enter the year:");
        int year=yy.nextInt();

        if(year%400==0){
            System.out.println("It is leap year");
        }
        else if(year%100==0)
        {
            System.out.println("Not leap year");
        }
        else if(year%4==0){
        System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }
        
    }
}