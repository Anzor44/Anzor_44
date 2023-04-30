package javaCore5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String [] args){

    // Создание тестового csv файла
    try (PrintWriter writer = new PrintWriter(new File("test.csv"))){

    StringBuffer sb = new StringBuffer();
        sb.append("Блиадзе");
        sb.append(' ');
        sb.append("Анзор");
        sb.append(' ');
        sb.append("Георгиевич");
        sb.append('\n');

        sb.append("31");
        sb.append('.');
        sb.append("07");
        sb.append('.');
        sb.append("1986");
        sb.append('\n');

        sb.append("300");
        sb.append(';');
        sb.append("400");
        sb.append(';');
        sb.append("500");
        sb.append('\n');

        writer.write(sb.toString());   //Записываем текстовое содержание в поток
        writer.close();                //close навсегда закрывает поток
        System.out.println();

    } catch (FileNotFoundException e){
    System.out.println(e.getMessage());
    }
    Test testCSV = new Test();
testCSV.readCSVFile();
    }
    // Созданный метод для чтения содержимого файла
    public void readCSVFile(){
        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("test.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println(records.toString());
    }
    private List<String> getRecordFromLine(String line){
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)){
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext());
            values.add(rowScanner.next());
        }
        return values;
    }

    }

