package _02_flow_control;

public class _11_doWhile_vs_continue {

	public static void main(String[] args) {
		case1();
	}

	private static void case1() {
		int x=0;
		do {
			x++;
			System.out.println(x);
			if(++x< 5)
				continue;
			x++;
			System.out.println(x);
		}while(++x <10);
	}

}
