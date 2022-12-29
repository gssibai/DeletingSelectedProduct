import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // Create file with sampled data
        initData();


        // Print file content
        System.out.println("Data before deleting");
        printData();

        // Deleting selected product
        int sec = 3;
        ArrayList<Data> products = readData();
        products.removeIf(t -> t.getUrunNo() == sec);
        writeData(products);

        // Print the new file content
        System.out.println("Data AFTER deleting");
        printData();

    }


    public static void initData() throws IOException {
        ArrayList<Data> products = new ArrayList<Data>();
        products.add(new Data(1, 20, "urun1", 20));
        products.add(new Data(2, 20, "urun2", 40));
        products.add(new Data(3, 70, "urun3", 40));
        products.add(new Data(4, 90, "urun4", 60));
        writeData(products);
    }

    public static void printData() throws IOException, ClassNotFoundException {
        ArrayList<Data> products = readData();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }


    public static void writeData(ArrayList<Data> arrData) throws IOException {
        FileOutputStream fos = new FileOutputStream("urunler.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        for (int i = 0; i < arrData.size(); i++) {
            oos.writeObject(arrData.get(i));
        }
        oos.close();
        fos.close();
    }

    public static ArrayList<Data> readData() throws IOException, ClassNotFoundException {
        ArrayList<Data> tempArr = new ArrayList<Data>();
        FileInputStream fis = new FileInputStream("urunler.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (fis.available() > 0) {
            Data data = (Data) ois.readObject();
            tempArr.add(data);
        }
        return tempArr;
    }
}
