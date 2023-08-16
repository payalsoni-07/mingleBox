public class Payment{
    private User buyer, coder;
    private double amount;
    public Payment(User buyer, User coder, double amount){
        this.buyer = buyer;
        this.coder = coder;
        this.amount = amount;
    }
}