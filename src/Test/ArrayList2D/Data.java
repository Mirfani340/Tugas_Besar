package Test.ArrayList2D;

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
    // Deque<Deque<String>> dual_data = new ArrayDeque();
    
    ArrayList<ArrayList<String>> dual_data = new ArrayList<>();
    
    public void SetNama () {
        System.out.print("Nama :");
        nama = input.next();
        ListNama.add(nama);//Input data ke ArrayList
        // DataNama.add(nama);//Menambahkan Queue
        dual_data.add(ListNama);
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
        // DataKeperluan.add(keperluan);//Menambahkan Queue
        dual_data.add(ListKeperluan);
    }

    public void GetKeperluan() {
        for (int i = 0; i < ListKeperluan.size(); i++) {
            System.out.print(ListKeperluan.get(i));
            System.out.println("\n");
        }
    }
}
