package basic;

public class StringDemo {
	public static void main(String[] args) {
		int i = 1;
		System.out.println(i);
		i = 10;
		System.out.println(i);
		String name = "hello java";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		String name1 = "hello again";
		System.out.println(name.concat(name1));
		name = "new String";
		System.out.println(name);
		System.out.println(name.concat(name1));
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(name1.contains(""));
		String s3 = "		ja  va		";
		System.out.println(s3.trim());
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
	}
}
