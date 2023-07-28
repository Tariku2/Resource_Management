package Jcalculator.area;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator=new AreaCalculator();
        Circle circle=new Circle(10);
        Square square=new Square(5);
        List<Object>shapes=List.of(circle,square);
        int sum=areaCalculator.sum(shapes);
        System.out.println("the sum of areas is"+sum);
    }
}
