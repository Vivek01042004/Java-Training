import java.util.Scanner;
public class Police
{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        int availableOfficers=0,untreatedCrimes=0;
        for(int i=0;i<n;i++){
            int event=scan.nextInt();
            if(event==-1){
                if(availableOfficers>0) availableOfficers--;
                else untreatedCrimes++;
            }
            else availableOfficers+=event;
        }
        System.out.println(untreatedCrimes);

    }
}