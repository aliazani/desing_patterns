package Structural.Flyweight.Solution;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type))
            icons.put(type,
                    new PointIcon(type, loadIcon(type)));


        return icons.get(type);
    }

    private byte[] loadIcon(PointType type) {
        System.out.println(MessageFormat.format("Finding {0}.png from {1} and save it to cache."
                , type.toString().toLowerCase(), "/src"));
        return null;
    }
}
