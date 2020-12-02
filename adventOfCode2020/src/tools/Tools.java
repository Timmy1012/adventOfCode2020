package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Tools {
    public static ArrayList<Integer> readFileLineByLineIntegers(String location) {
        ArrayList<Integer> input = new ArrayList<>();

        File file = new File(location);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                input.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }

    public static ArrayList<String> readFileLineByLine(String location){
        ArrayList<String> input = new ArrayList<>();

        File file = new File(location);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                input.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return input;
    }
}
