import java.util.Scanner;
class PSquareusingmath{
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number:");
        int no=n.nextInt();
        double i=Math.sqrt(no);
            
        if(i*i==no)
        {
                System.out.println("Prefect Square");

        }
        else{
                System.out.println("Not Prefect Square");
        }
    }
        
}
