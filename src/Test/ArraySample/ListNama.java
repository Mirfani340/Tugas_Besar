package Test.ArraySample;

import java.util.ArrayList;
import java.util.Scanner;

public class ListNama {
    Scanner input = new Scanner(System.in);
    ArrayList<String> ListNama = new ArrayList<String>();
    ArrayList<String> Listkeperluan = new ArrayList<String>();
    private String nama;

    public void SetNama() {
        System.out.print("Input Nama :");
        String InputNama = input.next();
        ListNama.add(InputNama);
    }

    public void GetNama() {
        for (int i = 0; i < ListNama.size(); i++) {
            System.out.print(ListNama.get(i));
        }
        return;
    }
}
