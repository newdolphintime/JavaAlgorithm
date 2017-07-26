package StackTest;

/**
 * Created by zhangwei on 2017/7/23.
 * <p>
 * 语法检查器
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;

    }

    public void check() {
        int stackSize = input.length();
        StackX theStack = new StackX(stackSize);

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    theStack.push(ch);
                    break;
                case '}':
                case ']':
                case ')':
                    if (!theStack.isEmpty()) {
                        char chx = theStack.pop();
                        if ((ch == '}' && chx != '{') ||
                                (ch == ']' && chx != '[') ||
                                (ch == ')' && chx != '(')) {
                            System.out.println("Error :" + ch + " at" + i);
                        } else {
                            System.out.println(chx + " 成功匹配 " + ch);
                        }

                    } else {
                        System.out.println("Error :" + ch + " at" + i);
                    }
                    break;
            }
        }
    }

    public static void main(String[] args) {
        BracketChecker bracketChecker = new BracketChecker("((1*2)+(3*4))");
        bracketChecker.check();
    }
}
