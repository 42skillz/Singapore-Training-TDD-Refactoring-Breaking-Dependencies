package dojorefactoring;

public class MassPricerPublisher {
    public void priceAndPublishEverything()
    {
        Iterable<String> underlyings = Perimeter.GetPerimeter();
        for (String underlying : underlyings)
        {
            PricingTask pricingTask = new PricingTask();
            pricingTask.priceAndPublish(underlying);
        }
    }
}
