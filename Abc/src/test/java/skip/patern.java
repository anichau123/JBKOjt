package skip;

public class patern {
	public static void main(String[] args) {
		int i = 40;
		int j = 25;

		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After Swaping = " + i);
		System.out.println("After Swaping = " + j);

	}

}
