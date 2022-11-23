import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Gen {

    private final Map<String, Integer> proposals;

    public Gen() {
        this.proposals = new Leitor().convertToMap();
    }

    public void printTracks() {
        final String[] letter = new String[] { "A", "B", "C", "D" };
        final List<Map.Entry<String, Integer>> entries = new ArrayList<>(proposals.entrySet());

        int trackPos = 0;
        int proposalHit = 0;
        int current = 540;
        boolean hasInitialPrint = false;

        while (proposalHit < proposals.size() - 1) {
            proposalHit++;

            if (!hasInitialPrint) {
                System.out.format("### %s ###", letter[trackPos]).println();

                hasInitialPrint = true;
            }

            final Map.Entry<String, Integer> entry = entries.get(proposalHit);

            System.out.format("%s - %s", numberAsHour(current), entry.getKey()).println();

            current += entry.getValue();

            if (current == 720) {
                current += 60;

                System.out.println("12:00 - Almoço");
            }

            if (current == 1020) {
                System.out.println("17:00 - Evento de Networking\n");

                hasInitialPrint = false;

                current = 540;
                trackPos++;
            }
        }

        if (current < 1020 && proposalHit == proposals.size() - 1) {
            System.out.println("17:00 - Evento de Networking");
        }
    }

    public String numberAsHour(int number) {
        final int hour = number / 60;
        final int minutes = number % 60;

        return (hour < 10 ? "0" + hour : hour) + ":" + (minutes < 10 ? "0" + minutes : minutes);
    }

}