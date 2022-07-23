package CollectionJavaCore;

import java.util.ArrayList;

public class newArrayList {
    public static void main(String[] args) {


        // Cырой тип
        // ArrayList list = new ArrayList();

        // Нормальный параметриз тип
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(15);
        // создание новой уоллекции на основании другой коллеуции = копия коллекции
        ArrayList<Integer> list4 = new ArrayList<Integer>(list3); 
    }
    
}
