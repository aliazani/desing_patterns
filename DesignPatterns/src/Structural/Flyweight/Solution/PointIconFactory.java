package Structural.Flyweight.Solution;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!icons.containsKey(type))
            icons.put(type,
                    new PointIcon(type, loadIcon(type, "/src")));


        return icons.get(type);
    }

    public byte[] loadIcon(PointType type, String path) {
        System.out.println(MessageFormat.format("Finding and reading {0} icon from {1}", type.toString(), path));
        return null;
    }
}
