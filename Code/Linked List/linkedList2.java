/*
Concept of linked-list through
the Collections Framework.
 */

import java.util.*;
public class linkedList2 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.addLast("list");
        System.out.println(list);

        System.out.println(list.size());

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
    }
}
