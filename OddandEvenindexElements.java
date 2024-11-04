import java.util.Scanner;
public class OddandEvenindexElements{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();;
        }
        int i=0,j=s/2,temp;
        System.out.println();
        for(i=0;i<s;i++){
            if(i%2==0) System.out.println("The even indexelement:"+arr[i]);
        }
        for(i=0;i<s;i++){
            if(i%2!=0) System.out.println("The odd index element:"+arr[i]);
        }
        
}
}