package homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvExport {
    public void writeResult(Toy toy){
        File file = new File("homework2/WinnedToys.txt");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(toy.getToyName()+" Сброшен, "+toy.getAmountRemaining()+" Осталось\n");
            FileWriter fr = new FileWriter(file, true);
            fr.write(sb.toString());
            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}