package _07_Exception_handling;

public class _06_try_catch_control_flow {
/*

			try{
				statement1;
				statement2;
				statement3;
			}
			catch(X e){
				statement4;
			}
			statement5;

case 1) No exception
--> statement1,statement2,statement3,statement4,statement5
(normal termination)

case 2) if exception raised at statement2 and corresponding catch block matched
-->statement1,statement4,statement5
(normal termination)

case 3) if exception raised at statement2 and corresponding catch block not matched
-->statement1
(abnormal termination)

case 4) if an exception raised at statement4 or statement5 then it is always abnormal
termination
------------------------
Note: (i)within the try block if anywhere exception raised then rest of the try block
		won't be executed even though we handled that exception, hence within the
		try block we have to take only risky code and length of try block should be
		as less as possible.
	 (ii)In addition to try block there may be a chance of raising an exception inside
	 	 catch and finally block.
	 (iii)If any statement which is not part of try block and raises exception then it
	 	 	is always abnormal termination.
 */
}
