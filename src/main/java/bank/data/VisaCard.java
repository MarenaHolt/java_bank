package bank.data;

public class VisaCard extends Card{
//    public VisaCard(PaymentSystem paymentSystem) {
//        super(PaymentSystem.VISA);
//    }

    public VisaCard() {
        super(PaymentSystem.VISA);
    }

//    @Override
//    public void payInCountry(Country country, int amount) {
//        if(isCountryValidForTheseCard(country) && isBalanceGreaterThan(amount)) {
//            //Проверим, что на балансе хватит денег перед платежом
//            //if (balance >= amount) {
//                balance = balance - amount;
//                System.out.println("Accepted!");
//        }
//    }

    protected boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
