import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class MoodAnalyser {

    String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException, Exception {
        String[] split = message.split(" ", 0);



        for (String x : split) {
            if (x.equals("Sad")) {
                return "SAD";
            }
            if (x.equals("Happy")) {
                return "HAPPY";
            }
        }

        if(message.equals("NULL")){
            throw new MoodAnalysisException();
        }

        else{
            throw  new Exception();
        }

    }

}

class MoodAnalysisException extends Exception{
    public String toString(){
        return "MoodAnalysisException";
    }
}
