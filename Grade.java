import java.util.Scanner;
class Grade{
    public static void main(String [] args){
        Scanner no= new Scanner(System.in);
        System.out.print("Enter the marks:");
        int n=no.nextInt();
        
        if (n>90)
         {
            System.out.println("The Grade is A");
            
        }
        else if (n>80)
         {
            System.out.println("The Grade is B");
            
        }
        else if (n>70)
         {
            System.out.println("The Grade is C");
            
        }
        else if (n>60)
         {
            System.out.println("The Grade is D");
            
        }
    }
}