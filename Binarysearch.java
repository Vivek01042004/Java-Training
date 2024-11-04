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
        int key=7,s=0,e=arr.length-1,c=0;
            while (s <= e) {
                int m = (s + e) / 2;
                if (arr[m] == key) {
                    c++; 
                    break;
                } 
                else if (arr[m] < key) s = m + 1; 
                else  e = m - 1; 
            }
        if(c>0) System.out.println("The element is present in the array");
        else System.out.println("The element is not present in the array");  
}
}
