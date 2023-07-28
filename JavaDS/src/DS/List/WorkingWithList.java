package DS.List;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String>colorsUnmodifiable=List.of(
                "Green",
                "Violet"

        );
        // doesn't work due to list immutablity
        //colorsUnmodifiable.add("purple");


        List colors=new ArrayList();
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("White"));
        System.out.println(colors.contains("Yellow"));
        for (Object color:colors){
            System.out.println(color);
        }
        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));

        }
    }

}
