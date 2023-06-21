package dojorefactoring.thirdparties;


import javax.swing.*;

public class MarketDataRetriever {
    public double getClose(String underlying)
    {
        if (System.getProperty("licence") == null)
        {
            JOptionPane.showMessageDialog(null, "Pas de licence!", "Titre", JOptionPane.ERROR_MESSAGE);
            throw new ConfigurationException();
        }

        return underlying.hashCode();
    }
}
