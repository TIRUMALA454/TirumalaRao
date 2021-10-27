package Day3;
import java.util.regex.Pattern;
public class PatternRegex {

	public static void main(String[] args) {
		String str1="flyingreturn.base@airindia.in";
		String str2="star.retros@airindia.in";
      System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}.\\w{1,}",str1));//false
      System.out.println(Pattern.matches("\\w{3,}@\\w{2,}\\.\\w{1,}.*",str2));
      String str3="020-26231407";
      System.out.println(Pattern.matches("[0-9]{3,}-[0-9]{6,8}",str3));//true
      String str4="1860 233 1407";
      System.out.println(Pattern.matches("[0-9]{4,8}|[0-9]{6,8}|[0-9]{6,8}",str4));//true
	}
	

}
