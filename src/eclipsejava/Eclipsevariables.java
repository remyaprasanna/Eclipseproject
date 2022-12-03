package eclipsejava;

public class Eclipsevariables {
	int i=17;
	static String str1="learning java";
	int[] arr= {2,5,7,8,9 };
	int add(int a,int b) {
	return a+b;
}

public void display() {
	System.out.println("hi how are you....display is getting executed");
}

	public static void main(String[] args) {
		Eclipsevariables obj=new Eclipsevariables();
		System.out.println(obj.i);
		System.out.println(obj.add(4, 8));
		System.out.println(str1);
	}
}
		
	


