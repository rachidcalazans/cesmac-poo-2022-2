//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class TextReaderPOJO {
    public TextReaderPOJO() {
    }



    public List<String> getLines() {
        List<String> lines = new ArrayList();
        String dir = System.getProperty("user.dir");
        File proposals = new File(dir, "Prova03/proposals.txt");
        BufferedReader bufferedReader = null;



        try {
            bufferedReader = new BufferedReader(new FileReader(proposals));
        } catch (FileNotFoundException var7) {
            var7.printStackTrace();
            return lines;
        }


        String line;
        try {
            while((line = bufferedReader.readLine()) != null) {
                if (line.length() != 0) {
                    lines.add(line);
                }
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }


        return lines;
    }


    public LinkedHashMap<String, Integer> convertToMap() {
        Map<String, Integer> map = new HashMap();
        List<String> lines = this.getLines();

        String[] words;
        int duration;
        for(Iterator var3 = lines.iterator(); var3.hasNext(); map.put(String.join(" ", (CharSequence[])Arrays.copyOf(words, words.length - 1)), duration)) {
            String line = (String)var3.next();
            words = line.split(" ");
            String last = words[words.length - 1];
            if (last.equalsIgnoreCase("lightning")) {
                duration = 5;
            } else {
                duration = Integer.parseInt(last.replace("min", ""));
            }
        }


        List<Map.Entry<String, Integer>> list = new ArrayList(map.entrySet());
        list.sort(Entry.comparingByValue());
        LinkedHashMap<String, Integer> values = new LinkedHashMap();

        for(int i = list.size() - 1; i >= 0; --i) {
            Map.Entry<String, Integer> entry = (Map.Entry)list.get(i);
            values.put((String)entry.getKey(), (Integer)entry.getValue());
        }

        return values;
    }
}

