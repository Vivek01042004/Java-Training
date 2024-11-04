import java.util.Scanner;
public class ArrayDynamic{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();;
        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i]+" ");
        }

    }
}