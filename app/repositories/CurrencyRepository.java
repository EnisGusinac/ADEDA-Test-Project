package repositories;

import models.Currency;
import java.util.HashSet;
import java.util.Set;

public class CurrencyRepository {

    public static Set<Currency> allCurrencies() {
        Set<Currency> currencies = new HashSet<>();

        currencies.add(new Currency("bitcoin", "Bitcoin",  "BTC", 1, 573.137, 1.0,
                72855700.0, 9080883500.0,15844176.0,15844176.0,0.0,
                0.04,-0.3,-0.57,1472762067));

        currencies.add(new Currency(
                "ethereum", "Ethereum", "ETH", 2, 12.1844, 0.021262,
                24085900.0, 1018098455.0,83557537.0,83557537.0,0.0,
                -0.58,6.34,8.59,1472762062));

        currencies.add(new Currency("ripple", "Ripple",  "XRP", 3, 0.916231, 0.00010707,
                1710090000.0, 35741452836.0,39009215838.0,99992725510.0,100000000000.0,
                -0.94,19.82,6.63,1518210241));


        return currencies;
    }

}
