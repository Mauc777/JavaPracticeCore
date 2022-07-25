package CollectionJavaCore;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedHashSetCollection {

    public static void main(String[] args) {

        var a = new LinkedHashSet<>(Arrays.asList(1, 8, 9, 2, 7, 789, 95, 2, 85, 9, 2, 4, 5, 44));
                                                  // [1, 8, 9, 2, 7, 789, 95, 85, 4, 5, 44, 128]
        var b = new LinkedHashSet<>(Arrays.asList(5, 4, 8, 8, 8, 5, 65, 65, 6, 9, 8, 5, 4, 8, 9, 10));
                                                  // [5, 4, 8, 65, 6, 9, 10, 1]
        a.add(128);
        b.add(1);
        System.out.println(a);
        System.out.println(b);
    }

}
