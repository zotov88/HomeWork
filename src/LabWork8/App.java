package LabWork8;

import java.io.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        File file1 = new File("D://first.txt");
        File file2 = new File("D://second.txt");

        try {
            if (file1.createNewFile() && file2.createNewFile()) {
                System.out.println("Файл " + file1.getName() + " создан.");
                System.out.println("Файл " + file2.getName() + " создан.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file1))) {
            Scanner scanner = new Scanner(System.in);
            String line;
            System.out.println("Вводите данные для записи в файл. Слово \"stop\" прекращает ввод.");
            while (!(line = scanner.nextLine()).equalsIgnoreCase("stop")) {
                bw.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file1));
             BufferedWriter bw = new BufferedWriter(new FileWriter(file2))) {
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line + "\tдлина строки: " + line.length() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Операция завершена.");
        }
    }
}
