package util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {

    public static void writeFile(String path, List<String> stringList, boolean append) {
        try {
            FileWriter fileWriter = new FileWriter(path, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : stringList) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
    }

    public static List<String> readFile(String path) {
        List<String> stringList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đọc file");
        }

        return stringList;
    }
}