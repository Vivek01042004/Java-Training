import java.util.Scanner;
public class Linearsearch{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();
        }
        int key=20,c=0;
        for(int i=0;i<s;i++){
            if(arr[i]==key){ 
                c++;
                break;
        }
        if(c>0) System.out.println("The element is present in the array");
        else System.out.println("The element is not present in the array");
     }
     
}
}