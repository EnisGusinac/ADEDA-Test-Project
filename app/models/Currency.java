package models;

import java.util.Set;

/**
 *  Currency model
 */
public class Currency {

    public String id;
    public String name;
    public String symbol;
    public Integer rank;
    public Double price_usd;
    public Double price_btc;
    public Double volume_usd_24h;
    public Double market_cap_usd;
    public Double available_supply;
    public Double total_supply;
    public Double max_supply;
    public Double percent_change_1h;
    public Double percent_change_24h;
    public Double percent_change_7d;
    public Integer last_updated;

    // Constructor
    public Currency(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Set the currencies as list of currency
    private static Set<Currency> currencies;
    // add an example of currency for show purpose
    static {
        currencies.add(new Currency("Eutherium", "Euth"));
    }

    // All Currencies
    public static Set<Currency> allCurrencies() {
        return currencies;
    }

    // Find specific currency in currencies
    public static Currency findById(String id) {
        for (Currency currency : currencies) {
            if (id.equals(currency.id)){
                return currency;
            }
        }
        return null;
    }

    // add a new currency in a list
    private static void add(Currency currency) {
        currency.add(currency);
    }

    // remove specific currency
    public static boolean remove(Currency currency) {
        return currencies.remove(currency);
    }



}
