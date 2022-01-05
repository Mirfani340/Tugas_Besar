package AntrianBank;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Data {
    protected String nama;
    protected String keperluan;
    protected int no;

    Scanner input = new Scanner(System.in);
    Queue<String> ListNama = new LinkedList<>();
    Queue<String> ListKeperluan = new LinkedList<>();
    Queue<Integer> ListNo = new LinkedList<>();
    
    public void SetNama() {
        System.out.print("\t\t\tNama : ");
        nama = input.nextLine();
        ListNama.add(nama);
    }

    public void SetKeperluan() {
        System.out.print("\t\t\tKeperluan : ");
        keperluan = input.nextLine();
        ListKeperluan.add(keperluan);
    }

    public void SetNo() {
        no++;
        ListNo.add(no);
    }

    public void GetData() {
        if (isEmpty()) {
            System.out.println("Maaf Data Masih Kosong");
        } else {
            System.out.println("\t\t\t========================================================");
            System.out.print("\t\t\tNama\tKeperluan\tNo Antri\n");
            System.out.println("\t\t\t========================================================");
            for (int i = 0; i < ListNama.size(); i++) {
            System.out.print("\t\t\t"+ListNama.toArray()[i]+"\t"+ListKeperluan.toArray()[i]+"\t\t"+ListNo.toArray()[i]);
            System.out.println("\n");
            }
        System.out.print("\t\t\t========================================================");   
        }
    }

    public boolean isEmpty() {
        return ListNo.isEmpty();
    }
}
