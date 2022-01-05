//package ArrayList2D;
//
//public class Dequeue extends Data{
//
//    Data[] data = new Data[];
//
//    int head = 0;
//    int flag = 1;
//    public void dequeue() {
//
//        String tmp = data[0];
//        for (int i = 0; i < data.length - 1; i++) {
//            data[i] = data[i + 1];
//        }
//        head--;
//        if (head >= 0) {
//            data[head] = null;
//            flag++;
//        } else {
//            flag = 0;
//            head = 0;
//            return "\t\t\t\tQueue is empty";
//        }
//        return "No.00" + flag + ", Nama : " + tmp;
//    }
//}
