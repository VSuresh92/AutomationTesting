package learningjava;

import org.apache.commons.lang3.StringUtils;

public class LearnString {

	public static void main(String[] args) {

	}

	public static void basicsOfString() {

		// TODO Auto-generated method stub
		String s = "Sachin Tendulkar";
		String s1 = " Sachin Tendulkar ";
		String A = "java2novice";
		String B = "java_language_is_sweet";
		String C = "java_java_java_java";
		String D = "abcabcbb";
		String sPopularTopic_1 = "SeleniumAutomationFramework";
		char[] ch = { 's', 'u', 'r', 'e', 's', 'h' };
		String[] aSplit = sPopularTopic_1.split("Frame");
		System.out.println(aSplit);
		System.out.println("The first part of the array is : " + aSplit[1]);
		System.out.println("The last part of the array is : " + aSplit[0]);

		String obj = new String(ch);
		System.out.println(obj + " " + obj);
		System.out.println(s + " " + s);
		System.out.println(50 + 30 + s + 50 + 30);
		System.out.println(s.concat(s));
		System.out.println(obj.concat(s));
		System.out.println(obj.toUpperCase());
		System.out.println(s.toUpperCase());
		System.out.println(s1.trim());
		System.out.println(s1);
		System.out.println(s1.startsWith(" "));
		System.out.println(s.substring(9));
		System.out.println(s.substring(4, 9));
		System.out.println(A.substring(3));
		System.out.println(B.substring(9, 16));
		System.out.println(s.charAt(7));
		System.out.println(s.length());
		System.out.println(s.replace("Sachin", "Suresh"));
		System.out.println(s.replace("S", "V"));
		System.out.println(B.split("language"));
		StringBuffer str = new StringBuffer("Suresh");
		System.out.println(str.append("Kumar"));
		System.out.println(str.insert(11, str));
		System.out.println(str.insert(1, str));

		String st = "12 hi when 8 and 9";
		String[] num = st.split(" ");
		System.out.println(num);
		System.out.println(num.length);
		st = st.replaceAll("[\\D]+", " ");
		System.out.println(st);
		String[] num1 = st.split(" ");
		System.out.println(num1.length);

	}

	public static void removeWhitSpace() {

		String str = "Suresh suji     sudhan";
		System.out.println(StringUtils.normalizeSpace(str));
	}

}
