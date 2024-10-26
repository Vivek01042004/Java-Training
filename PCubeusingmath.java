import java.util.Scanner;
class PCubeusingmath{
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        System.out.print("Enter the number:");
        int no=n.nextInt();
        double i=Math.cbrt(no);
            
        if(i*i*i==no)
        {
                System.out.println("Prefect Cube");

        }
        else{
                System.out.println("Not Prefect Cube");
        }
    }
        
}
