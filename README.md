Задание 1: HiMethod
Задание 2: HiMethodSimple
Задание 3: OutPutArrayMethod


Задание 4: 
- Нет нельзя. Вместо предпоследней квадратной скобки следует постьавитиь круглую.


`
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

static boolean areBalanced(String s) {
final var stack = new LinkedList<Character>();
final var n = s.length();
for (var i = 0; i < n; i++) {
final var ch = s.charAt(i);
switch (ch) {
case '(':
stack.push(')');
break;
case '[':
stack.push(']');
break;
case '{':
stack.push('}');
break;
case ')':
case ']':
case '}':
if (stack.isEmpty()) {
return false;
}
final char top = stack.pop();
if (top != ch) {
return false;
}
}
}
return stack.isEmpty();
}

public static void main(String[] args) {
System.out.println(areBalanced("[((())()(()))]"));
}
}
`
