package Structural.Flyweight.Challange;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    Map<Integer, CellContext> fonts = new HashMap<>();

    public CellContextFactory() {
        var context = new CellContext("Times New Roman", 12, false);
        fonts.put(Objects.hash(context.getFontFamily(), context.getFontSize(), context.isBold()),
                context);
        System.out.println(MessageFormat.format("Saving (fontName:{0}, size:{1}, Bold:{2}) to cache"
                , context.getFontFamily(), context.getFontSize(), context.isBold()));
    }

    public CellContext getCellContext(String fontFamily, int fontSize, boolean isBold) {
        var hash = Objects.hash(fontFamily, fontFamily, isBold);
        if (!fonts.containsKey(hash))
            fonts.put(hash, loadFont(fontFamily, fontSize, isBold));

        return fonts.get(hash);
    }

    private CellContext loadFont(String fontFamily, int fontSize, boolean isBold) {
        System.out.println(MessageFormat.format("Saving (fontName:{0}, size:{1}, Bold:{2}) to cache"
                , fontFamily, fontSize, isBold));
        return new CellContext(fontFamily, fontSize, isBold);
    }

}
