import java.util.Arrays;

public class exercise6185 {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {

        int playerIndex = 0;
        int trainerIndex = 0;
        int maxPairs = 0;

        Arrays.sort(players);
        Arrays.sort(trainers);

        while (playerIndex < players.length && trainerIndex < trainers.length) {

            if (players[playerIndex] <= trainers[trainerIndex]) {
                maxPairs++;
                playerIndex++;
                trainerIndex++;
            } else {
                trainerIndex++;
            }

        }

        return maxPairs;

    }

    public static void main(String[] args) {
        int[] players = new int[] { 4, 7, 9 };
        int[] trainers = new int[] { 8, 2, 5, 8 };

        System.out.println(matchPlayersAndTrainers(players, trainers));

    }
}
