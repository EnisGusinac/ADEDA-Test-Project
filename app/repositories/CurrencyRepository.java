package repositories;

import models.Currency;
import java.util.HashSet;
import java.util.Set;

public class CurrencyRepository {

    public static Set<Currency> allCurrencies() {

        Set<Currency> currencies = new HashSet<>();

        // 1. Bitcoin
        currencies.add(new Currency("bitcoin", "Bitcoin",  "BTC", 1, 573.137, 1.0,
                72855700.0, 9080883500.0,15844176.0,15844176.0,0.0,
                0.04,-0.3,-0.57,1472762067));

        // 2. Ethereum
        currencies.add(new Currency(
                "ethereum", "Ethereum", "ETH", 2, 12.1844, 0.021262,
                24085900.0, 1018098455.0,83557537.0,83557537.0,0.0,
                -0.58,6.34,8.59,1472762062));

        // 3. Ripple
        currencies.add(new Currency("ripple", "Ripple",  "XRP", 3, 0.916231, 0.00010707,
                1710090000.0, 35741452836.0,39009215838.0,99992725510.0,100000000000.0,
                -0.94,19.82,6.63,1518210241));

        // 4. Bitcoin Cash
        currencies.add(new Currency("bitcoin-cash", "Bitcoin Cash",  "BCH", 4, 1216.13, 0.148103,
                714842000.0, 20626157663.0,16960488.0,16960488.0,21000000.0,
                -1.36,-5.91,-3.8,1518296952));

        // 5. Cardano
        currencies.add(new Currency("cardano", "Cardano",  "ADA", 5, 0.391123, 0.00004763,
                926374000.0, 10140673610.0,25927070538.0,31112483745.0,45000000000.0,
                -1.26,0.89,-10.8,1518296954));

        // 6. Litecoin
        currencies.add(new Currency("litecoin", "Litecoin",  "LTC", 6, 150.439, 0.0183208,
                570493000.0, 8298054745.0,55158933.0,55158933.0,84000000.0,
                -1.63,-4.77,-3.29,1518296941));

        // 7. Stellar
        currencies.add(new Currency("stellar", "Stellar",  "XLM", 7, 0.387935, 0.00004724,
                219938000.0, 7150502312.0,18432217541.0,103669352049.0,null,
                -2.12,-1.75,-10.78,1518296943));

        // 8. Neo
        currencies.add(new Currency("neo", "NEO",  "NEO", 8, 105.504, 0.0128485,
                340129000.0, 6857760000.0,65000000.0,100000000.0,null,
                -2.05,-8.57,-13.58,1518296947));

        // 8. EOS
        currencies.add(new Currency("eos", "EOS",  "EOS", 9, 8.74714, 0.00106525,
                602093000.0, 5780259201.0,660817044.0,900000000.0,1000000000.0,
                -1.24,-6.06,-11.38,1518296951));

        // 8. NEM
        currencies.add(new Currency("nem", "NEM",  "XEM", 10, 0.562166, 0.00006846,
                73237400.0, 5059493999.0,8999999999.0,8999999999.0,null,
                -1.91,-1.09,-9.88,1518296945));
  
        return currencies;
    }

    /**
     *  Find specific item by its Id.
     * @param id
     * @return
     */
    public static Currency findById(String id) {
        for (Currency currency : allCurrencies()) {
            if (id.equals(currency.id)) {
                return currency;
            }
        }
        return null;
    }

    /**
     * Add new values to currency object
     * @param currency
     */
    public static void add(Currency currency) {
        allCurrencies().add(currency);
    }


    /**
     * Remove currency from repository
     * @param currency
     */
    public static boolean remove(Currency currency) {
        return  allCurrencies().remove(currency);
    }



}
