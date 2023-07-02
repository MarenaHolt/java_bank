package bank.data;

public class MasterCard extends Card{

    public MasterCard(PaymentSystem paymentSystem) {
        super(PaymentSystem.MASTERCARD);
    }

//    @Override
//    public void payInCountry(Country country, int amount) {
//        if(isCountryValidForTheseCard(country) && isBalanceGreaterThan(amount)) {
//            balance = balance - amount;
//            System.out.println("Accepted!");
//        }
//    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
