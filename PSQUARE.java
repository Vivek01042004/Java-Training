import java.util.Scanner;
class PSQUARE{
    public static void main(String [] args){
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the number:");
        int no=n.nextInt(),i=2;
        while(i*i<no)
        i+=1;{
            if(i*i==no){
                System.out.println("Prefect Square");

            }
            else{
                System.out.println("Not Prefect Square");
            }
        }
        
    }
}