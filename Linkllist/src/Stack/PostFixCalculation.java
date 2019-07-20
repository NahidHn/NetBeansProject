/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 88017
 */
public class PostFixCalculation {

    static Stack<Integer> stack = new Stack<>();

    static boolean isOperator(char ch) {

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
            return true;
        } else {
            return false;
        }
    }

    static int calculate(int a, int b, char ch) {

        switch (ch) {
            case '+':
                stack.push(a + b);
                break;
            case '-':
                stack.push(a - b);
                break;
            case '*':
                stack.push(a * b);
                break;
            case '/':
                stack.push(a / b);
                break;
            case '^':
                int c = (int) Math.pow((double) a, (double) b);
                stack.push(c);
                break;
        }
        return 0;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your expression : ");
        int di;
        String expression = input.nextLine();
        char[] ch = expression.toCharArray();

        for (int index = 0; index < expression.length(); index++) {

            if (isOperator(ch[index])) {
                int a = stack.pop();
                int b = stack.pop();
                calculate(a, b, ch[index]);

            } else {
                di = (int) (ch[index] - 48);
                stack.push(di);
            }

        }

        System.out.println("Result is : " + stack.pop());
    }

}
