package repositories;

import models.Currency;

import java.util.HashSet;
import java.util.Set;

public class CurrencyRepository {

    public static Set<Currency> allCurrencies() {
        Set<Currency> currencies = new HashSet<>();
        currencies.add(new Currency(
                "ETH", "Ethereum", "", 1, 1.1, 1.1,
                1.1, 1.1,1.1,1.1,1.1,
                1.1,1.1,1.1,1));
        currencies.add(new Currency("BTC", "Bitcoin",  "", 1, 1.1, 1.1,
                1.1, 1.1,1.1,1.1,1.1,
                1.1,1.1,1.1,1));));
        currencies.add(new Currency("LTC", "Litecoin",  "", 1, 1.1, 1.1,
                1.1, 1.1,1.1,1.1,1.1,
                1.1,1.1,1.1,1));
        return currencies;
    }

}
