package DSA.Stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split("");
        //stack.push(str[0]);
        System.out.println(Arrays.toString(str));
        for(String ch:str){
            stack.push(ch);
        }
        System.out.println(stack);
        StringBuilder reversed = new StringBuilder();
        while(!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        System.out.println(reversed);


    }


}
