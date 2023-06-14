import flyweight.TextStyleFlyweightFactory;

import flyweight.*;

public class Main {
    public static void main(String[] args) {
        String text = "Hello, world!";
        TextStyle boldStyle = TextStyleFlyweightFactory.getStyle("Bold", "Red", 16);
        TextStyle italicStyle = TextStyleFlyweightFactory.getStyle("Italic", "Blue", 12);
        TextStyle underlineStyle = TextStyleFlyweightFactory.getStyle("Underline", "Green", 14);

        // Apply text styles to different parts of the text
        boldStyle.applyText(text.substring(0, 5));
        italicStyle.applyText(text.substring(7, 12));
        underlineStyle.applyText(text.substring(13));
    }
}