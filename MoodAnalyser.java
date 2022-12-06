import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class MoodAnalyser {

    String message;
    public MoodAnalyser(){}

    public MoodAnalyser(String message){
        this.message = message;
    }

    public String analyseMood() throws Exception{
        String[] split = message.split(" ", 0);

        boolean invalidMood = true;

        for (String x: split){
            if (x.equals("Sad")){
                return "SAD";
            }
            if (x.equals("Happy")){
                return "HAPPY";
            }
        }

        if (invalidMood){
            throw  new Exception();
        }
        return "INVALID";
     }

}
