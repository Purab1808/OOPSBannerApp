package OOPSBanner.UC3;
import java.util.*;
public class BannerFunctions {
    public static void main(String[] args) {
        List<String> o1=getOPattern();
        List<String> o2=getOPattern();
        List<String> p=getPPattern();
        List<String> s=getSPattern();
        printPattern(o1,o2,p,s);
    }
    public static List<String> getOPattern(){
        List<String> pattern=new ArrayList<>();
        pattern.add(" **** ");
        pattern.add("*    *");
        pattern.add("*    *");
        pattern.add("*    *");
        pattern.add(" **** ");

        return pattern;
    }
    public static List<String> getPPattern(){
        List<String> pattern=new ArrayList<>();
        pattern.add("***** ");
        pattern.add("*    *");
        pattern.add("***** ");
        pattern.add("*     ");
        pattern.add("*     ");

        return pattern;
    }
    public static List<String> getSPattern(){
        List<String> pattern=new ArrayList<>();
        pattern.add("******");
        pattern.add("*     ");
        pattern.add("******");
        pattern.add("     *");
        pattern.add("******");

        return pattern;
    }
    public static void printPattern(List<String> o1, List<String> o2, List<String> p, List<String> s) {
        for (int i = 0; i < o1.size(); i++) {
            String line =
                    o1.get(i) + "  " +
                    o2.get(i) + "  " +
                    p.get(i)  + "  " +
                    s.get(i);

            System.out.println(line);
        }
    }
}
