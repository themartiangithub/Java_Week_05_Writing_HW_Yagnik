package java_week_05_writing_hw_yagnik;

import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorList = new ArrayList<>();
        colorList.add("RED");
        colorList.add("BLUE");
        colorList.add("GREEN");
        colorList.add("YELLOW");
        colorList.add("BLACK");
        colorList.add("WHITE");
        colorList.add("ORANGE");
        colorList.add("PURPLE");
        colorList.add("CYAN");

        for (String colourList : colorList) {
            System.out.print(colourList + ", ");
        }
    }
}
