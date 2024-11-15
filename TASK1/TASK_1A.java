import java.util.Scanner;
public class TicketChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int noteCount = 0;
        for (int denom : denominations) {
            // Add the number of notes of current denomination
            noteCount += N / denom;
            // Reduce the amount N by the value of the notes
            N = N % denom;
        }
        System.out.println(noteCount);  
        sc.close();
    }
}
