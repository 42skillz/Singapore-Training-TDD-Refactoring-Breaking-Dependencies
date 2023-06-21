package dojorefactoring;

import dojorefactoring.thirdparties.MarketDataRetriever;
import dojorefactoring.thirdparties.PricePublisher;

public class PricingTask {
    private MarketDataRetriever marketDataRetriever;

    public PricingTask()
    {
        marketDataRetriever = new MarketDataRetriever();
    }
    public void priceAndPublish(String underlying)
    {
        double yesterdayPrice = marketDataRetriever.getClose(underlying);
        //FIXME en fait, ça devrait être + 2 et non pas + 1
        double todayPrice = yesterdayPrice + 1;
        PricePublisher.getInstance().publish(todayPrice);
    }
}
