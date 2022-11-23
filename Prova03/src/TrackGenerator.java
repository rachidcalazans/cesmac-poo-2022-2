//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrackGenerator {
    private final Map<String, Integer> proposals = (new TextReaderPOJO()).convertToMap();


    public TrackGenerator() {
    }


    public void printTracks() {
        String[] letter = new String[]{"A", "B", "C", "D"};
        List<Map.Entry<String, Integer>> entries = new ArrayList(this.proposals.entrySet());
        int trackPos = 0;
        int proposalHit = 0;
        int current = 540;
        boolean hasInitialPrint = false;


        while(proposalHit < this.proposals.size() - 1) {
            ++proposalHit;
            if (!hasInitialPrint) {
                System.out.format("### %s ###", letter[trackPos]).println();
                hasInitialPrint = true;
            }


            Map.Entry<String, Integer> entry = (Map.Entry)entries.get(proposalHit);
            System.out.format("%s - %s", this.numberAsHour(current), entry.getKey()).println();
            current += (Integer)entry.getValue();
            if (current == 720) {
                current += 60;
                System.out.println("12:00 - Almoço");
            }

            if (current == 1020) {
                System.out.println("17:00 - Evento de Networking\n");
                hasInitialPrint = false;
                current = 540;
                ++trackPos;
            }
        }

        if (current < 1020 && proposalHit == this.proposals.size() - 1) {
            System.out.println("17:00 - Evento de Networking");
        }

    }



    public String numberAsHour(int number) {
        int hour = number / 60;
        int minutes = number % 60;
        Object var10000 = hour < 10 ? "0" + hour : hour;
        return "" + var10000 + ":" + (minutes < 10 ? "0" + minutes : minutes);
    }
}
