import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Hewan
        ArrayList<String> animal = new ArrayList<>();
        animal.add("COW");
        animal.add("RABBIT");
        animal.add("LAMB");
        animal.add("CAMEL");
        animal.add("SHEEP");

        // Membuat objek DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("RABBIT");
        deleteHewan.add("LAMB");
        deleteHewan.add("CAMEL");

        // Menghapus data dari objek Hewan yang sama dengan data warna yang terdapat pada objek DeleteHewan
        Iterator<String> iterator = animal.iterator();
        while(iterator.hasNext()){
            String animals = iterator.next();
            if(deleteHewan.contains(animals)){
                iterator.remove();
            }
        }

        // Menampilkan hasil penghapusan data
        System.out.println("Hasil penghapusan data:");
        for(String animals : animal){
            System.out.println(animals);
        }
    }
}
