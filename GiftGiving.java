import java.util.Scanner;
public class GiftGiving{
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
    
        int s=scanner.nextInt();
        int givers[]=new int[s+1];
        for(int i=1;i<=s;i++){
            int receiver=scanner.nextInt();
            givers[receiver]=i;
        }
        for (int i=1;i<=s;i++) {
            System.out.print(givers[i] + " ");
        }
        System.out.println();     
}
}