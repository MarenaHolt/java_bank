package bank.data;

import static bank.data.Country.RU;

public class MaestroCard extends Card implements ICard{
    public MaestroCard() {
        super(PaymentSystem.MAESTRO);
    }

    @Override
    protected boolean isCountryValidForTheseCard(Country country) {
        return RU == country;
    }
}
