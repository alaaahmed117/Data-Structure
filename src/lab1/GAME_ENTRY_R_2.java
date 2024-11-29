package lab1;


// R-1.2


class GameEntry {
    int score;

    GameEntry(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "GameEntry{score=" + score + '}';
    }
}

public class GAME_ENTRY_R_2 {
    public static void main(String[] args) {
        // Create an array A of GameEntry objects
        GameEntry[] A = new GameEntry[5];
        A[0] = new GameEntry(100);
        A[1] = new GameEntry(200);
        A[2] = new GameEntry(300);
        A[3] = new GameEntry(400);
        A[4] = new GameEntry(500);

        // Clone A and store the result in B
        GameEntry[] B = A.clone();

        // Print initial scores of A and B
        System.out.println("Initial scores:");
        System.out.println("A[4]: " + A[4]);
        System.out.println("B[4]: " + B[4]);

        // Set A[4].score to 550
        A[4].score = 550;

        // Print scores after modification
        System.out.println("\nScores after setting A[4].score to 550:");
        System.out.println("A[4]: " + A[4]);
        System.out.println("B[4]: " + B[4]);
    }
}
