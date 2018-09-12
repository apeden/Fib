
public class fibonacci {
/*Limit of result*/
	private static final int MAX_TERM_VALUE = 10000;

/*runs the programme*/
	public static void run() {
		int first = 0;
		int second = 1;
		int term = 0;
		while (term < MAX_TERM_VALUE) {
			System.out.println(term);
			term = first + second;
			first = second;
			second = term;
		}	
	}
	public static void main(String[] args) {
		run();
	}
}
