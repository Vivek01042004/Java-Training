import java.util.Scanner;
public class Smallestno{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();
        }
        int small=arr[0];
        for(int i=1;i<s;i++){
            if(arr[i]<small) small=arr[i];
        }
        System.out.println(" ");
        System.out.println("The Smallest number is: "+small);
        
    }
}