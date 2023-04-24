//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false

package For_java_HW;
import java.util.ArrayDeque;
import java.util.Deque;
public class Task_4_5 {
    public static void main(String[] args) {

        //String str = "()[]"; // true
        // String str = "()"; // true
        // String str = "{[()]}"; // true
        // String str = "()()"; // true
         String str = ")()("; // false
        String openTags  = "({["; 
        String closeTags = ")}]"; 
        boolean res = true;
        Deque<Character> deque = new ArrayDeque<>();
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (openTags.indexOf(ch) >= 0) {
                deque.offerFirst(ch);
            } 
            else {
                int index = closeTags.indexOf(ch);
                if (index >= 0) {
                    if (deque.size() == 0 || deque.pollFirst() != openTags.charAt(index)) {
                        res = false;
                        break;
                    }
                }
            }
            if (!res)
                break;
        }
        System.out.println(res);
    }
}
       
