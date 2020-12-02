package day2;

import java.util.ArrayList;
import java.util.Arrays;

import static tools.Tools.readFileLineByLine;

public class day2 {
    public static void main(String[] args) {
        ArrayList<String> input = readFileLineByLine("/home/tim/IdeaProjects/adventOfCode2020/adventOfCode2020/src/day2/input.txt");

        ArrayList<String[]> lines = new ArrayList<>();
        for (String line : input) {
            String[] array;

            array = line.split(" ");
            lines.add(array);
        }

        ArrayList<int[]> ranges = new ArrayList<>();
        ArrayList<Character> characters = new ArrayList<>();
        ArrayList<String> passwords = new ArrayList<>();

        for (String[] line : lines) {
            ranges.add(Arrays.stream(line[0].split("-")).mapToInt(Integer::parseInt).toArray());
            characters.add(line[1].charAt(0));
            passwords.add(line[2]);
        }

        int valid = 0;
        for (int i = 0; i < ranges.size(); i++) {
            int count = 0;

            for (char character : passwords.get(i).toCharArray()) {
                if (character == characters.get(i))
                    count++;
            }

            if (count >= ranges.get(i)[0] && count <= ranges.get(i)[1])
                valid++;
        }

        System.out.println("valid count: " + valid);

        int valid2 = 0;
        for (int i = 0; i < ranges.size(); i++) {
            char toCheck = passwords.get(i).charAt(ranges.get(i)[0] - 1);
            char toCheck2 = passwords.get(i).charAt(ranges.get(i)[1] - 1);

            if (toCheck == characters.get(i)) {
                if (toCheck2 != characters.get(i)) {
                    valid2++;
                }
            } else if (toCheck2 == characters.get(i)) {
                valid2++;
            }
        }

        System.out.println("valid part 2: " + valid2);
    }
}
