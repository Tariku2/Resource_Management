package ArrayList.demo;


import java.util.ArrayList;

public class ArrayListTest {
        public static void main(String[] args) {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            cars.set(2,"Mercedes");
           /* for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i));

            */
            cars.stream().filter(c->c.startsWith("M")).forEach(s-> System.out.println(s));
            }
        }



