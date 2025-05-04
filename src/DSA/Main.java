package DSA;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        //System.out.println(stack.empty());

        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        System.out.println(stack.empty());
        System.out.println(stack);
        String myFavgame = stack.pop();
        System.out.println(stack);
        String remain=stack.peek();
        System.out.println(remain);
        System.out.println(stack);
        System.out.println(myFavgame);

        System.out.println(stack.search("d"));

        for(int i = 0; i<=10;i++){
            stack.push("a");
        }
        System.out.println(stack);
    }
}
