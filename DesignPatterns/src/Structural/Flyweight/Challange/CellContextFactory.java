package Structural.Flyweight.Challange;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    Map<Integer, CellContext> fonts = new HashMap<>();

    public CellContext getCellContext(String fontFamily, int fontSize, boolean isBold) {
        var hash = Objects.hash(fontFamily, fontFamily, isBold);
        if (!fonts.containsKey(hash))
            fonts.put(hash, new CellContext(fontFamily, fontSize, isBold));

        return fonts.get(hash);
    }

}
