package Test.ArrayList2D;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.SetNama();
        data.SetKeperluan();
        data.SetNama();
        data.SetKeperluan();
        // System.out.println(data.dual_data.get(0).get(0));
        System.out.println(data.dual_data.get(0).get(0)+"\t"+data.dual_data.get(0).get(1));
        // System.out.print(data.dual_data.get(0).get(1));
        System.out.println(data.dual_data.get(1).get(0)+"\t"+data.dual_data.get(1).get(1));

        System.out.println(data.dual_data.get(0).size());
        System.out.println(data.dual_data.get(0).remove(0));
        System.out.println(data.dual_data.get(0).size());

        System.out.println(data.dual_data.get(0).get(0)+"\t"+data.dual_data.get(0).get(1));
        // System.out.println(data.dual_data.get(0).get(0)+"\t"+data.dual_data.get(0).get(1));

    }
}
