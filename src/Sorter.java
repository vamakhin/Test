import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by qwerty on 23.02.2017.
 */
public class Sorter {

    public static void main(String[] args) throws IOException {
/* Test Git */
        /* New changes to file */
        
        String[] array =  loadAndSort(new FileReader("input.txt"));
        for (String s : array) {
            System.out.println(s);
        }

    }

    public static String[] loadAndSort(FileReader in) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(in);

        ArrayList<String> lines = new ArrayList<String>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        bufferedReader.close();

        String[] array = lines.toArray(new String[lines.size()]);
        Arrays.sort(array);
        return array;
    }
}
