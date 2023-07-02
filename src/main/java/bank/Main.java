package bank;

import bank.data.Card;
import bank.data.Country;
import bank.data.UnionPayCard;
import bank.data.VisaCard;

import static bank.data.Country.RU;

public class Main {

//    public static void main(String[] args) {
//        Card visaCard = new VisaCard();
//        //visaCard.balance = 100;
//        visaCard.setBalance(100);
//        //System.out.println(visaCard.isCountryValidForTheseCard(RU));
//        visaCard.payInCountry(RU, 75);
//        System.out.println(visaCard.getPaymentSystem());
//        System.out.println(visaCard.getBalance());
//    }

    public static void main(String[] args) {
        invoke(new VisaCard());
        invoke(new UnionPayCard());
    }

    public static void invoke(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println("Current balance: " + card.getBalance());
    }
}
