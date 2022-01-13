package RedisDemo;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Queue queue = new Queue();
        Scanner input = new Scanner(System.in);

            System.out.println("\n\t\t====================================================");
            System.out.println("\t\t\t\t\t Selamat datang di Bank");
            System.out.println("\t\t\t\tMemberikan pelayanan yang terbaik");
            System.out.println("\t\t====================================================");
            queue.dbGetStatus();
            int menu;
            boolean status;
            do{
                System.out.println("\n");
                System.out.println("\t\tPilih menu : ");
                System.out.println("\n\t\t\t\t1. Pengambilan nomor antri");
                System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
                System.out.println("\t\t\t\t3. Lihat data antrian");
                System.out.println("\t\t\t\t4. Cek Riwayat");
                System.out.println("\t\t\t\t5. Keluar");
                System.out.print("\n\t\tPilihan Anda : ");
                menu = input.nextInt();
                if(menu==1){
                    queue.SetNo();
                    queue.NoRiwayat();
                    queue.SetNama();
                    queue.SetKeperluan();
                    queue.dbSetData();
                }else if(menu==2){
                    queue.deque();
                }else if(menu==3){
                    queue.GetData();
                }else if(menu==4){
                    queue.GetRiwayat();
                }else if(menu==5){
                    System.out.println("\n\t\t\t\tTerimakasih!!!!");
                    break;
                }else if (menu>5){
                    System.out.println("Perhatikan Input anda");
                }
            }while(status = true);
        }
    }