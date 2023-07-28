package java11demo.test;

import java.util.ArrayList;
import java.util.List;

public class Java11Demo {
    public static void main(String[]args){
        String msg="Hello Everyone ";
        System.out.println(msg.repeat(3));
        System.out.println(msg.isBlank());
        System.out.println("".isBlank());
        System.out.println(msg.strip());
        System.out.println(msg.stripLeading());
        System.out.println(msg.stripTrailing());
        System.out.println(msg.stripIndent());
        msg="This\nis\na\nmultiline\ntext.";
        List<String>lines=new ArrayList<>();
        msg.lines().forEach(line->lines.add(line));
        lines.forEach(line->System.out.println(line));

        }
    }


