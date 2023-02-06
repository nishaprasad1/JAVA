package _02_flow_control;

public class _10_labeled_BreakAndContinue {

	public static void main(String[] args) {
		case1();
	}

	private static void case1() {
		l1:
			for(int i=0; i<5; i++) {
				System.out.println("l1_"+i);
				l2:
					for(int j=0; j<5; j++) {
						System.out.println("l2_"+j);
						l3:
							for(int k=0; k<5; k++) {
								System.out.println("l3_"+k);
								if(k==2)
									break l2;
							}
					}
			}
	}

}
