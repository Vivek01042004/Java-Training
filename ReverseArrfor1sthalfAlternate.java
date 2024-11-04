import java.util.Scanner;
public class ReverseArrfor1sthalfAlternate{
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
        for(i=0,j=(s/2)-1;i<s/4;i++,j--){
            temp=arr[i];
            arr[i]=arr[j-i];
            arr[j-i]=temp;
        }
        for(i=0;i<s;i++) System.out.print(arr[i]+" ");
    }
}