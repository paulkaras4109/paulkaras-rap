import java.lang.String;

public class PrintDog {
	public static void main(String[] args) {
		String dog = "-----%d\n"
				+ "-0  0--------------%b\n"
				+ "-------------------%f\n"
				+ "       ||      ||\n%s";
		String dogName = "Fido";
		System.out.println(String.format(dog, 1, false, 2.5, dogName));
	}
}
