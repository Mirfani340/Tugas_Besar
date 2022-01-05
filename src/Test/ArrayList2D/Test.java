package Test.ArrayList2D;

import java.util.LinkedList;
import java.util.Queue;


public class Test {
    public static void main(String[] args) {
        Queue<String> NamaList = new LinkedList();
        Queue<String> KeperluanList = new LinkedList();
        NamaList.add("Irfan");
        NamaList.add("Dina");
        KeperluanList.add("Makan");
        KeperluanList.add("CS");

        System.out.println(NamaList.peek()+"\t"+KeperluanList.peek());
        NamaList.poll();
        KeperluanList.poll();
        System.out.println(NamaList.peek()+"\t"+KeperluanList.peek());

    }
}
