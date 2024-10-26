import java.util.Scanner;
class Levels{
    public static void main(String [] args){
        Scanner mo= new Scanner(System.in);
        System.out.print("Enter the level:");
        String m=mo.nextLine();
        switch(m){
        case "Beginner":
        {
               System.out.println("Level-1");
               break;
               
        }
        case "Intermediate":
         {
            System.out.println("Level-2");
            break;
            
        }
        case "Expert":
         {
            System.out.println("Level-3");
            break;
            
        }
    
        
        
    }
}
}