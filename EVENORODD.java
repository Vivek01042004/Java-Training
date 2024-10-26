import java.util.Scanner;
class EVENORODD{
    public static void main(String [] args){
        Scanner n= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int no=n.nextInt();
        int r;
        r=no&1;
        if(r==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}