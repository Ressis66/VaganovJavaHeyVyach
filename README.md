<h2> Задание 1: HiMethodSimple </h2>
<h2> Задание 2: HiMethod </h2> 
<h2> Задание 3: OutPutArrayMethod </h2>


<h2> Задание 4: </h2>
<p> - Нет нельзя. Вместо предпоследней квадратной скобки следует поставитиь закрывающую круглую.
<p>- Ниже - код, проверящий правильность решения:



<p>import java.util.Deque;
<p>import java.util.LinkedList;
<p>import java.util.Scanner;

<p>public class Main {

<p>static boolean areBalanced(String s) {
<p>final var stack = new LinkedList<Character>();
<p>final var n = s.length();
<p>for (var i = 0; i < n; i++) {
<p>final var ch = s.charAt(i);
<p>switch (ch) {
<p>case '(':
stack.push(')');
break;
<p>case '[':
stack.push(']');
break;
<p>case '{':
stack.push('}');
break;
<p> case ')':
<p> case ']':
<p> case '}':
<p>if (stack.isEmpty()) {
return false;
}
<p> final char top = stack.pop();
<p>if (top != ch) {
<p>return false;
}
}
}
<p>return stack.isEmpty();
}

<p>public static void main(String[] args) {
<p>System.out.println(areBalanced("[((())()(()))]"));
}
}

