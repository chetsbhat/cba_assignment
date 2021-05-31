package ParseFile;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateTestData {

    public void testFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ganap\\IdeaProjects\\Chaitra\\src\\test\\java\\ParseFile\\TestData.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }
// delete the last new line separator
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        System.out.println(content);
    }

    public void myFile() throws IOException {
        String fileName = "C:\\Users\\ganap\\IdeaProjects\\Chaitra\\src\\test\\java\\ParseFile\\TestData.txt";
        List<String> filestream = Files.readAllLines(Paths.get(fileName));
        Map<Integer, String> myMap = new HashMap();

        StringBuilder myBuyilder = new StringBuilder("");
        int counter = 1;

        for (String string : filestream) {
            if (!string.contains("]]")) {
                myBuyilder.append(string);
            } else {
                myMap.put(counter, myBuyilder.toString());
                myBuyilder = new StringBuilder();
                counter++;
            }

        }

        for (Map.Entry<Integer, String> myInput : myMap.entrySet()) {
            System.out.println(myInput.getValue());

        }

    }

}
