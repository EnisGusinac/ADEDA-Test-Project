package models;

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

    // Here I will use Java Telescoping pattern (populating properties in constructor)
    // instead of using Java Beans pattern (populating properties by using setters and getters)
    public Currency(String id,
                    String name,
                    String symbol,
                    Integer rank,
                    Double price_usd,
                    Double price_btc,
                    Double volume_usd_24h,
                    Double market_cap_usd,
                    Double available_supply,
                    Double total_supply,
                    Double max_supply,
                    Double percent_change_1h,
                    Double percent_change_24h,
                    Double percent_change_7d,
                    Integer last_updated)
    {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.price_usd = price_usd;
        this.price_btc = price_btc;
        this.volume_usd_24h = volume_usd_24h;
        this.market_cap_usd = market_cap_usd;
        this.available_supply = available_supply;
        this.total_supply = total_supply;
        this.max_supply = max_supply;
        this.percent_change_1h = percent_change_1h;
        this.percent_change_24h = percent_change_24h;
        this.percent_change_7d = percent_change_7d;
        this.last_updated = last_updated;
    }

}

