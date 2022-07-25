package CollectionJavaCore;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetCollection {
    public static void main(String[] args) {

        var a = new TreeSet<>(Arrays.asList(1, 8, 9, 12, 4, 5, 7, 2));
        var b = new TreeSet<>(Arrays.asList(1, 5, 8, 5, 4, 7, 9, 3, 2, 5, 4, 7, 9, 5, 4));
        System.out.println(a.contains(5));

    }

}
