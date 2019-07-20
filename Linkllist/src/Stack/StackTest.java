/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Stack;

/**
 *
 * @author 88017
 */
public class StackTest {
    public static void main(String[] args) {
         Stack<String> stack = new Stack<>();
         stack.push("Nahid");
         stack.push("Nahida");
         
         System.out.println("Stack : "+stack);
         
         System.out.println("deleting : "+stack.pop());
         
         System.out.println("After deleting : "+stack);
         
    
    }
    
    
}
