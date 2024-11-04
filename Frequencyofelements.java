import java.util.Scanner;
public class Frequencyofelements{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int s=scanner.nextInt();
        int arr[]=new int[s];
        int H[]=new int[100];
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<s;i++){
            arr[i]=scanner.nextInt();;
        }
        System.out.println();
        for(int i=0;i<s;i++){
            H[arr[i]]++;
        }
        for(int j=0;j<100;j++){
            if(H[j]>0) System.out.println(j+"-"+H[j]);      
        }      
}
}