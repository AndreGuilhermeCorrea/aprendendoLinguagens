package aprendendoJava;

public class boxing_unboxing {

	public static void main(String[] args) {


		int x = 20;
		
		Object obj = x;
		
		System.out.println(obj);

		int y = (int) obj;
		
		System.out.println(y);
		
	}

}
