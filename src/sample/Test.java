package sample;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        str.append("[\"");
        for (int i = 0; i < list.size(); i++) {
            str.append(list.get(i) + "\",");
        }
        System.out.println(str);
    }
}
