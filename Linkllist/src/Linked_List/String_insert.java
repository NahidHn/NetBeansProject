package Linked_List;

import java.util.LinkedList;
import java.util.Scanner;

public class String_insert {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int b = s.nextInt();
        int item;
        System.out.print("Enter the elements : ");

        //Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < b; i = i + 1) {

            item = s.nextInt();
            list.add(item);

        }

        //Traversing
        System.out.print("The Linkedlist is : ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        //Inserting
        System.out.println("\nInsert a data in linkedList : ");
        item = s.nextInt();
        list.add(item);

        System.out.println("\nAfter inserted a data : ");
        for (Integer i : list) {
            System.out.print(i + " ");
        }

        //Deleting
        System.out.println("Enter the data that you want to delete : ");
        item = s.nextInt();
        list.remove(item);
        
        System.out.println("After deleted  a data : ");
        int[] sortArr = new int[list.size()]; 
        int arrIndex = 0;
        for (Integer i : list) {
            System.out.print(i + " ");
            sortArr[arrIndex++] = i;
        }
        
        //Sorting
        System.out.println("\nAfter sorting : ");
        int temp;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < (list.size() - i - 1) ; j++) {
                if(sortArr[j] > sortArr[j+1]){
                    temp = sortArr[j];
                    sortArr[j] =   sortArr[j+1];
                    sortArr[j+1] = temp;
                }
            }
        }
         for (int i = 0; i < list.size(); i++)
             System.out.print(sortArr[i]+" ");

    }
}
