import java.util.Scanner;
import java.util.Stack;

public class pushpoptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        while (n-- > 0) {
            int op = sc.nextInt();
            if (op == 1) {
                int x = sc.nextInt();
                s.push(x);
            } else if (op == 2) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else if (op == 3) {
                if (s.isEmpty()) {
                    System.out.println("Empty!");
                }
            } else {
                System.out.println(s.peek());
            }
        }
        sc.close();
    }
//    sc.close();
}
