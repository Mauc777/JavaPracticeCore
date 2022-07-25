package CollectionJavaCore;

import java.util.Stack;

public class StackCollection {

    public static void main(String[] args) {

        Stack<Integer> stackk = new Stack<>();
        stackk.push(1);
        stackk.push(12);
        stackk.push(123);
        System.out.println(stackk.pop()); // 123
        System.out.println(stackk.pop()); // 12
        System.out.println(stackk.pop()); // 1

    }
}
/// Наглядный пример Stack-а это ИНФИКС\ПОСТФИКС запись выражениЯ
