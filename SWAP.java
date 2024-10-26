class SWAP{
    public static void main(String [] args){//Swap of 2 elements without using any extra varaible
        int a=5,b=7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}