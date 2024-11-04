import java.util.Scanner;
public class SecondLargestno{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();
        }
        int m=arr[0],n=0;
        for(int i=1;i<s;i++){
            if(arr[i]>m) m=arr[i];
        }
        System.out.println("The largest number is: "+m);
        for(int i=1;i<s;i++){
            if(arr[i]!=m && arr[i]>n) n=arr[i];
        }
        System.out.println("The 2nd largest number is: "+n);
     }
}