package dojorefactoring.thirdparties;

import javax.swing.*;

public class PricePublisher {
    private static final PricePublisher instance = new PricePublisher();

    private PricePublisher(){
    }

    public static PricePublisher getInstance() {
        return instance;
    }

    public void publish(double price){
        JOptionPane.showMessageDialog(null, "T'as publié un prix bidon en prod, le trader est furieux !");
    }

}
