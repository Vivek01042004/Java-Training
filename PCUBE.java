import java.util.Scanner;
class PCUBE{
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=n.nextInt(),i=2;
        while(i*i*i<no)
        i+=1;{
            if(i*i*i==no){
                System.out.println("Prefect Cube");

            }
            else{
                System.out.println("Not Prefect Cube");
            }
        }
        
    }
}