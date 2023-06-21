package dojorefactoring.thirdparties;

import dojorefactoring.MassPricerPublisher;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MarketDataRetrieverUncommittedTest {

    @Test
    @Ignore
    public void should_crash() {
        MarketDataRetriever marketDataRetriever = new MarketDataRetriever();
        marketDataRetriever.getClose("USD/EUR");
    }

    @Test
    public void should_run_the_buggy_pricer() {
        MassPricerPublisher massPricerPublisher = new MassPricerPublisher();
        massPricerPublisher.priceAndPublishEverything();
    }
}