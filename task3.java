// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом

package For_java_HW;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Task_4_3 {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,4,3,2,1));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
    }    
}