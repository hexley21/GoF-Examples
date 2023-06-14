package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Flyweight Factory
 */
public class TextStyleFlyweightFactory {
    private static final Map<String, TextStyle> styleMap = new HashMap<>();

    public static TextStyle getStyle(String name, String color, int size) {
        String key = name + color + size;
        TextStyle style = styleMap.get(key);

        if (style == null) {
            style = new TextStyle(name, color, size);
            styleMap.put(key, style);
        }

        return style;
    }
}
