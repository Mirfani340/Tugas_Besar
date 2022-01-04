package Test.ArrayList2D;

import java.util.ArrayList;
import java.util.Scanner;

public class Data {
    private String nama;
    private String keperluan;
    Scanner input = new Scanner(System.in);
    ArrayList<String> ListNama = new ArrayList<>();
    ArrayList<String> ListKeperluan = new ArrayList<>();

    public void SetNama () {
        System.out.print("Nama :");
        nama = input.next();
        ListNama.add(nama);
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
        ListKeperluan.add(keperluan);
    }

    public void GetKeperluan() {
        for (int i = 0; i < ListKeperluan.size(); i++) {
            System.out.print(ListKeperluan.get(i));
            System.out.println("\n");
        }
    }
}
