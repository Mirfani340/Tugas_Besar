package Sample;

import java.util.Scanner;

public class DataPenjualan {

    public int id;
    public String nama, keperluan;
    public DataPenjualan next;

    static Scanner Scanint = new Scanner(System.in);
    static Scanner Scanstr = new Scanner(System.in);

    public void input(){
        System.out.println();
        System.out.print("\t\t\t\t\tMasukkan id           : ");
        id = Scanint.nextInt();
        System.out.print("\t\t\t\t\tMasukkan nama         : ");
        nama = Scanstr.nextLine();
        System.out.print("\t\t\t\t\tMasukkan keperluan    : ");
        keperluan = Scanstr.nextLine();
        next=null;
    }

    public void read(){

        System.out.println("\t\t\t\t|| "+id+"\t\t|| "+nama+" \t\t|| "+keperluan+"\t\t||");

    }
}
