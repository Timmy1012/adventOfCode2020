package day1;

import java.util.ArrayList;

import static tools.Tools.readFileLineByLineIntegers;

public class day1 {
    public static void main(String[] args) {
        ArrayList<Integer> input = readFileLineByLineIntegers("/home/tim/IdeaProjects/adventOfCode2020/adventOfCode2020/src/day1/input.txt");

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
