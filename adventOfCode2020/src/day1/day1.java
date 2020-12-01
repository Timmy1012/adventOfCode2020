package day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class day1 {
    public static ArrayList<Integer> readFile(String location) {
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

    public static void main(String[] args) {
        ArrayList<Integer> input = readFile("/home/tim/IdeaProjects/adventOfCode2020/adventOfCode2020/src/day1/input.txt");

        for (Integer value : input) {
            for (Integer value1 : input) {
                for (Integer value2 : input) {
                    if (value + value1 + value2 == 2020) {
                        System.out.printf("product = %d\n", value * value1 * value2);
                        System.exit(0);
                    }
                }
            }
        }
    }
}
