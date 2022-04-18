package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerAndBufferedReader {
    public static void main(String[] args) throws IOException {
        scannerExample();
        readerExample();
    }

    public static void scannerExample(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String str = scanner.nextLine();
        double dou = scanner.nextDouble();
        scanner.close();
    }

    public static void readerExample(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int a = Integer.parseInt(reader.readLine());
            String str = reader.readLine();
            double dou = Double.parseDouble(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
