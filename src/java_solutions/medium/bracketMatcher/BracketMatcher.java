package java_solutions.medium.bracketMatcher;

public class BracketMatcher {

    public static void main(String[] args) {
        System.out.println(bracketMatcher("(coder)(byte))"));
    }

    public static int bracketMatcher(String str) {
        int difference = 0;
        for (char c: str.toCharArray()) {
            switch (c) {
                case '(':
                    difference++;
                    break;
                case ')':
                    difference--;
                    break;
            }
            if (difference < 0) return 0;
        }
        return difference == 0 ? 1 : 0;
    }
}