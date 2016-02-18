/**
 * Created by avk on 8/18/14.
 */
public class MiscUtils {
    public static String getClassName(){
        StackTraceElement[] trace = Thread.currentThread().getStackTrace();
        return trace[2].getClassName();
    }

}
