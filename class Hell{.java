class Hell{
    public static void main(String [] args){
        var discount =10;
        double totalPrice=200;
        double priceAfterDicount=totalPrice*(1-((double)discount/100));
        System.out.println("Customer has paid a bill of amount:"+priceAfterDicount);
    }
}