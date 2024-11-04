import java.util.Scanner;
public class Binarysearch{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();
        }
        int key=7,low=0,high=arr.length-1,t=0;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] == key) {
                    t=1; 
                    break;
                } else if (arr[mid] < key) {
                    low = mid + 1; 
                } else {
                    high = mid - 1; 
                }
            }
        if(t==1) System.out.println("The element is present in the array");
        else System.out.println("The element is not present in the array");  
}
}