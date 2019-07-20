package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class InsertingOperation {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size:");
        int b = s.nextInt();
        int item;
        System.out.println("Enter the elements:");

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < b; i = i + 1) {

            item = s.nextInt();
            list.add(item);

        }

        int arr[] = new int[list.size()];

        int i = 0;
        for (Integer data : list) {
            arr[i++] = data;
        }

        System.out.println("Inserting array : ");
        for (int j = 0; j < list.size(); j++) {
            System.out.print(arr[j] + " ");
        }

    }
}
