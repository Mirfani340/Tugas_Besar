package AntrianBank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Data {
    protected String nama;
    protected String keperluan;
    protected int no, numberRiwayat;

    Scanner input = new Scanner(System.in);
    Queue<String> ListNama = new LinkedList<>();
    Queue<String> ListKeperluan = new LinkedList<>();
    Queue<Integer> ListNo = new LinkedList<>();

    ArrayList<String> RiwayatNama = new ArrayList<>();
    ArrayList<String> RiwayatKeperluan = new ArrayList<>();
    ArrayList<Integer> noAntrian = new ArrayList<>();

    // ArrayList<ArrayList<String>> Database = new ArrayList<>();

    public void SetNama() {
        System.out.print("\n\t\t\t\tNama\t\t: ");
        nama = input.nextLine();
        ListNama.add(nama);
        RiwayatNama.add(nama);
    }

    public void SetKeperluan() {
        System.out.print("\t\t\t\tKeperluan\t: ");
        keperluan = input.nextLine();
        ListKeperluan.add(keperluan);
        RiwayatKeperluan.add(keperluan);
    }

    public void SetNo() {
        no++;
        ListNo.add(no);
    }

    // public String Database(String DataNama, String DataKeperluan) {
    //     Data
    // }

    public void GetData() {
        if (isEmpty()) {
            System.out.println("\n\t\t\tMaaf Data Masih Kosong");
        } else {
            System.out.println("\n\t\t\t================================================");
            System.out.print("\t\t\tNama\t|\tKeperluan\t|\tNo Antri\n");
            System.out.println("\t\t\t================================================");
            for (int i = 0; i < ListNama.size(); i++) {
                System.out.print("\t\t\t"+ListNama.toArray()[i]+"\t|\t"+ListKeperluan.toArray()[i]+"\t\t|\t"+ListNo.toArray()[i]);
                System.out.println("\n");
            }
            System.out.print("\n\t\t\t========================================================");
        }
    }

    public void NoRiwayat() {
        numberRiwayat++;
        noAntrian.add(numberRiwayat);
    }
    // public String Database (Kalo didalam sini bikin lagi) {
        
    // }

    public void GetRiwayat() {
        if (noAntrian.isEmpty()) {
            System.out.println("\n\t\t\tMaaf Data Masih Kosong");
        } else {
            System.out.println("\n\t\t\t========================================================");
            System.out.print("\t\t\tNama\t|\tKeperluan\t|\tNo Antri\n");
            System.out.println("\t\t\t========================================================");
            for (int i = 0; i < RiwayatNama.size(); i++) {
                System.out.print("\t\t\t"+RiwayatNama.get(i)+"\t|\t"+RiwayatKeperluan.get(i)+"\t\t|\t"+noAntrian.get(i));
                System.out.println("\n");
            }
            System.out.print("\n\t\t\t================================================");
        }
    }

    public boolean isEmpty() {
        return ListNo.isEmpty();
    }
}
