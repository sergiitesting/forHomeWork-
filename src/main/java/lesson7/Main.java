package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DataItem> list = new ArrayList<>();
        list.add(new DataItem("Mackerel", "mackerel-22", 20));
        list.add(new DataItem("Chicken spinach", "chicken-spinach-recipe-13", 50));
        list.add(new DataItem("Crepe suzette", "crepe-suzette-recipe-17", 10));
        list.add(new DataItem("Spinach omelet", "spinach-omelet-18", 25));
        list.add(new DataItem("Quick baked potato", "quick-baked-potato-7", 30));
        Collections.sort(list);
        list.forEach(System.out::println);
    }

//    Comparator<DataItem> comparator = Comparator.comparing(DataItem::getCookingTime);
//    це з використанням комператора
}
