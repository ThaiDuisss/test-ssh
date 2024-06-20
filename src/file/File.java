package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class File {

    public static void main(String[] args) {
        
        List<NewClass> s = new ArrayList<>();
        s.add(new NewClass("thaidz", 12));
        s.add(new NewClass("nhat", 12));
        s.add(new NewClass("the", 12));
        s.add(new NewClass("gioi", 12));
        s.add(new NewClass("vn", 12));
        
        try {
            FileWriter fw = new FileWriter("data.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (NewClass a : s) {
                bw.write(a.toString());
                bw.newLine();
            }
            bw.close();
            fw.close();
        } catch (Exception e) {

        }
    }

}
