package tj.code;

import java.util.ArrayList;

public class AList {
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("BMW");
        cars.add(" Toyota");
        cars.add("VolksWagon");
        cars.add("Mercedes");
        cars.remove(0);
        for(String i:cars) {
            System.out.println("cars are" + cars);
        }
    }
}
