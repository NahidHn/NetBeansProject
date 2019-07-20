/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author 88017
 */
public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Nahid");
        queue.add("Nahida");
        queue.add("Naid hassan");
        

        System.out.println("Stack : " + queue);

        System.out.println("deleting : " + queue.peek());

        System.out.println("After deleting : " + queue);

    }

}
