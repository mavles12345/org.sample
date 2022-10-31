package org.string;

public class String1 {

	public static void main(String[] args) {

		String s = "I like India much";
//
//		System.out.println(s.length());
//
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.contains("like"));
//		System.out.println(s.startsWith("I"));
//		System.out.println(s.endsWith("h"));
//		System.out.println(s.indexOf('k'));
//		System.out.println(s.lastIndexOf("i"));
//		char ch = s.charAt(10);
//		System.out.println(ch);
//
//		int last = s.lastIndexOf('k');
//		System.out.println(last);
//		
//		String replace = s.replace('k', 'v');
//		System.out.println(replace);
//		
//		System.out.println(replace.replaceAll("live", "love"));
//		
		System.out.println(s.indexOf('y'));
		System.out.println(s.charAt(100));
		s.isEmpty();
//		
//		String substring = s.substring(4);
//		System.out.println(substring);
//		String sub=s.substring(6, 7);
//		System.out.println(sub);

		String s1 = "I like India much";

		System.out.println(s.equals(s1));

		System.out.println(s.compareTo(s1));

		String s2 = "selvam";
		String s3 = "selvam";

		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		String s5 = s2.concat(s3);
		System.out.println(s5);

		StringBuffer s4 = new StringBuffer("selvam");
		StringBuilder s6 = new StringBuilder("selvam");
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s6));

		System.out.println(s4.append(s6));

		String s7 = "my Family";
		System.out.println(s7.length());

		System.out.println(s7.substring(3, 9));

		String s8 = "my Fam ily";

		String[] split = s8.split(" ", 3);
		for (String x : split) {

			System.out.println(x);

		}

	}

}
