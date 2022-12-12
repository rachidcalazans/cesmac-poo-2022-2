import java.io.*;
import java.util.*;

public class Leitor {

    public List<String> getLines() {
        final List<String> lines = new ArrayList<>();
        final String dir = System.getProperty("user.dir");
        final File proposals = new File(dir, "cesmac-poo-2022-2/Prova03/proposals.txt");

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(proposals));
        } catch (FileNotFoundException e) {
            e.printStackTrace();

            return lines;
        }

        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                if (line.length() == 0) continue;

                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lines;
    }

    public LinkedHashMap<String, Integer> convertToMap() {
        final Map<String, Integer> map = new HashMap<>();
        final List<String> lines = getLines();

        for (String line : lines) {
            final String[] words = line.split(" ");
            final String last = words[words.length - 1];

            int duration;

            if (last.equalsIgnoreCase("lightning")) {
                duration = 5;
            } else {
                duration = Integer.parseInt(last.replace("min", ""));
            }

            map.put(String.join(" ", Arrays.copyOf(words, words.length - 1)), duration);
        }

        final List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByValue());

        final LinkedHashMap<String, Integer> values = new LinkedHashMap<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            final Map.Entry<String, Integer> entry = list.get(i);

            values.put(entry.getKey(), entry.getValue());
        }

        return values;
    }

}
