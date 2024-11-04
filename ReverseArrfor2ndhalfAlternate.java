import java.util.Scanner;
public class ReverseArrfor2ndhalfAlternate{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();;
        }
        int temp;
        System.out.println();
        for(int i=(s)/2,j=s-1,k=0;k<s/4;i++,j--,k++){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for(int i=0;i<s;i++) System.out.print(arr[i]+" ");
    }
}