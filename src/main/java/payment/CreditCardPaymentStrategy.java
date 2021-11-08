package payment;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(double price){
        System.out.println("You paid " + price + "$ with the help of the credit card");
    }

}
