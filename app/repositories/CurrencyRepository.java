package repositories;

import models.Currency;
import java.util.HashSet;
import java.util.Set;

public class CurrencyRepository {

    public static Set<Currency> allCurrencies() {

        Set<Currency> currencies = new HashSet<>();

        // Bitcoin
        currencies.add(new Currency("bitcoin", "Bitcoin",  "BTC", 1, 573.137, 1.0,
                72855700.0, 9080883500.0,15844176.0,15844176.0,0.0,
                0.04,-0.3,-0.57,1472762067));

        // Ethereum
        currencies.add(new Currency(
                "ethereum", "Ethereum", "ETH", 2, 12.1844, 0.021262,
                24085900.0, 1018098455.0,83557537.0,83557537.0,0.0,
                -0.58,6.34,8.59,1472762062));

        // Ripple
        currencies.add(new Currency("ripple", "Ripple",  "XRP", 3, 0.916231, 0.00010707,
                1710090000.0, 35741452836.0,39009215838.0,99992725510.0,100000000000.0,
                -0.94,19.82,6.63,1518210241));

        // Bitcoin Cash
        currencies.add(new Currency("bitcoin-cash", "Bitcoin Cash",  "BCH", 4, 1216.13, 0.148103,
                714842000.0, 20626157663.0,16960488.0,16960488.0,21000000.0,
                -1.36,-5.91,-3.8,1518296952));

        // Cardano
        currencies.add(new Currency("cardano", "Cardano",  "ADA", 5, 0.391123, 0.00004763,
                926374000.0, 10140673610.0,25927070538.0,31112483745.0,45000000000.0,
                -1.26,0.89,-10.8,1518296954));

        // Litecoin
        currencies.add(new Currency("litecoin", "Litecoin",  "LTC", 6, 150.439, 0.0183208,
                570493000.0, 8298054745.0,55158933.0,55158933.0,84000000.0,
                -1.63,-4.77,-3.29,1518296941));

        return currencies;
    }

}
