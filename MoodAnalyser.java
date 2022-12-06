import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

public class MoodAnalyser {

    public String analyseMood(String message){
        String[] split = message.split(" ", 0);
        for (String x: split){
            if (x.equals("Sad")){
                return "SAD";
            }
        }
        return "HAPPY";
     }

}
