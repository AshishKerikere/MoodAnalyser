import java.util.Scanner;
public class MainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Message regarding Mood");
        String message = scanner.nextLine();

        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        try{System.out.println(moodAnalyser.analyseMood());}
        catch (MoodAnalysisException e){
            System.out.println("Empty Mood");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
