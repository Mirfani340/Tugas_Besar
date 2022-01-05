package Test.ArrayList;
import java.util.ArrayList;
public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<String> ListNama = new ArrayList();
        ArrayList<String> ListKeperluan = new ArrayList();
        ListNama.add("irfan");
        ListNama.add("Aiden");
        ListNama.add("Dina");
        ListKeperluan.add("Mancing");
        ListKeperluan.add("Sekolah");
        ListKeperluan.add("Belajar");

        ArrayList<ArrayList<String>> Data = new ArrayList();
        Data.add(ListNama);
        Data.add(ListKeperluan);

        // System.out.println(Data.get(0).get(0));
        // System.out.println(Data.get(1).get(0));

        String[] array = new String [Data.size()];

        // System.out.println("Nama");
        // for (int i = 0; i < Data.size(); i++) {
        //     System.out.println(Data.get(i));
        // }

        System.out.print("Nama\tKeperluan\n");
        for (int i = 0; i < ListNama.size(); i++) {
            System.out.print(ListNama.get(i)+"\t"+ListKeperluan.get(i));
            System.out.println("\n");
        }

        // for (int i = 0; i < ListKeperluan.size(); i++) {
        //     System.out.print(ListKeperluan.get(i));
        // }
    }
}