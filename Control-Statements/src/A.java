public class A {
	public static void main(String[] args) {

		String date = "2020/10/11";
		int n = 10;
		String abc = date.substring(date.length() - 2);
		int xyz = Integer.valueOf(abc);
		int add = n + xyz;
		String result = String.valueOf(add);
		System.out.println(date.substring(0, date.length() - 2) + result);

	}
}
