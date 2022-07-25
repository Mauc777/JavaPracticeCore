package CollectionJavaCore;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

    public static void main(String[] args) {

        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,78,9,8));
        var b =new HashSet<>(Arrays.asList(15,55,85,15,3,6,5,7,9,87,8,4));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 8, 9, 78]
        System.out.println(r); // [3, 4, 5, 6, 7, 8, 9, 15, 85, 55, 87]                      
        System.out.println(b); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 78, 15, 85, 55, 87]
        System.out.println(u); // [3, 4, 5, 6, 8, 9]
        System.out.println(s); //[1, 2, 78]
        boolean res = a.addAll(b);
        System.out.println(res); //true


  
  
        //#region
        // Set<Integer> stt = new HashSet<>();
        // stt.add(1);
        // stt.add(12);
        // stt.add(123);
        // stt.add(1234);
        // System.out.println(stt.contains(12));
        // stt.add(null);
        // System.out.println(stt.size()); // 5
        // System.out.println(stt); // [null, 1, 1234, 123, 12]
        // stt.remove(12);
        // for (var item : stt)
        //     System.out.println(item); // null
        //                               // 1
        //                               // 1234
        //                               // 123
        // stt.clear();
        // System.out.println(stt); // []
        //#endregion
    }

}
