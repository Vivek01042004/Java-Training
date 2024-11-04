import java.util.Scanner;
public class Binarysearch{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int key=7,s=0,e=arr.length-1,t=0;
            while (s <= e) {
                int mid = (s + e) / 2;
                if (arr[mid] == key) {
                    t++; 
                    break;
                } else if (arr[mid] < key) {
                    s = mid + 1; 
                } else {
                    e = mid - 1; 
                }
            }
        if(t>0) System.out.println("The element is present in the array");
        else System.out.println("The element is not present in the array");  
}
}
