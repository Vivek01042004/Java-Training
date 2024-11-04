import java.util.Scanner;
public class Floorarrays{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();
        }
        int m=arr[0],n=1;
        for(int i=1;i<s;i++){
            if(arr[i]>m){ 
            m=arr[i];
            n++;
        }
        
     }
     System.out.print(n);
}
}