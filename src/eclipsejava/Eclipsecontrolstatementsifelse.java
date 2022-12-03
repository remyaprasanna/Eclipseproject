package eclipsejava;

public class Eclipsecontrolstatementsifelse {
	int a=43;
	int Mul(int i,int j) {
		return i*j;	
	}

	public static void main(String[] args) {
		Eclipsecontrolstatementsifelse obj=new 	Eclipsecontrolstatementsifelse();
		int result=obj.Mul(6, 3);
		if(result>12) {
			System.out.println("output:"+result +"is greater than 12,condition satisfied");
		}
		else {
			System.out.println("condition is not satisfied");
		}
	}

}
