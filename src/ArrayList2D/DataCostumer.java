package ArrayList2D;

import java.util.Scanner;

public class DataCostumer {
    public String id;
    public String nama, keperluan;


    Scanner scanStr = new Scanner(System.in);
    Scanner scanInt = new Scanner(System.in);

    public void setData () {
        System.out.println("Masukan ID : ");
        id = scanStr.nextLine();
        System.out.println("Masukan Nama : ");
        nama = scanStr.nextLine();
        System.out.println("Masukan Keperluan");
        keperluan = scanStr.nextLine();

    }


//    public int getId() {
//        return id;
//    }

//    public void setId() {
//        System.out.println("Masukan ID : ");
//        id = scanInt.nextInt();
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama() {
//        System.out.println("Masukan Nama : ");
//        nama = scanStr.nextLine();
//    }
//
//    public String getKeperluan() {
//        return keperluan;
//    }
//
//    public void setKeperluan() {
//        System.out.println("Masukan Keperluan");
//        keperluan = scanStr.nextLine();
//    }
}
