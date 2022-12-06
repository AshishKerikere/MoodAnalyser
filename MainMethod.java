import java.util.Scanner;
public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Message regarding Mood");
        String message = scanner.nextLine();

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood(message));
    }
}
