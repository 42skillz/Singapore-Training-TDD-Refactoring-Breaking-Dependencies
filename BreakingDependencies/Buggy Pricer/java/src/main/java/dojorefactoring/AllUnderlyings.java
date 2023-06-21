package dojorefactoring;

import java.util.Arrays;

public class AllUnderlyings {
    public static Iterable<String> getAll()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return Arrays.asList("Cacao", "Sucre", "Petrole", "Carcasses de porc", "Or", "Cuivre");
    }
}
