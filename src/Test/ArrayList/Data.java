package Test.ArrayList;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class Data {
    private String nama;
    private String keperluan;
    Scanner input = new Scanner(System.in);
    ArrayList<String> ListNama = new ArrayList<>();
    ArrayList<String> ListKeperluan = new ArrayList<>();
    Deque<String> DataNama = new ArrayDeque<>();
    Deque<String> DataKeperluan = new  ArrayDeque<>();
    
    public void SetNama () {
        System.out.print("Nama :");
        nama = input.next();
        ListNama.add(nama);//Input data ke ArrayList
        DataNama.add(nama);//Menambahkan Queue
    }

    public void GetNama() {
        for (int i = 0; i < ListNama.size(); i++) {
            System.out.print(ListNama.get(i));
            System.out.println("\n");
        }
    }

    public void SetKeperluan() {
        System.out.print("Keperluan :");
        keperluan = input.next();
        ListKeperluan.add(keperluan);//Input data ke ArrayList
        DataKeperluan.add(keperluan);//Menambahkan Queue
    }

    public void GetKeperluan() {
        for (int i = 0; i < ListKeperluan.size(); i++) {
            System.out.print(ListKeperluan.get(i));
            System.out.println("\n");
        }
    }

    // public int GetSize() {
    //     int data = DataNama.size();
    //     return data;
    // }
}
