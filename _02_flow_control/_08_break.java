package _02_flow_control;

public class _08_break {
/*
 * 1. we can use break in following:
 * 		a) inside Switch to stop fall-through
 * 			switch(x){
 			case 1: sopln("one");
 					break;
 			case 2: sopln("two");
 					break;
 			}
 * 		b) inside loops
 			to break loop execution based on some condition
 			for(int i=0; i<10;i++){
 				if(i==5)
 					break;
 				sopln(i);
 			}
 *		c)inside labeled blocks
 *			to break block execution based on some condition
 			int x=10;
 			l1:{
 			sopln("begin");
 			if(x==10)
 			break l1;
 			sopln("end");
 			}
 			sopln("hello");
 			
 */
	public static void main(String[] args) {
		case1();
	}
	
	private static void case1() {
		final int x=10;		
		l1:{
			System.out.println("begin");
			if(x==10)
				break l1;
			System.out.println("end");
		}
		System.out.println("hello");
	}
}
