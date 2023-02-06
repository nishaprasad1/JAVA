package _08_multithreading;

public class _14_Green_Thread {
/*
 * 1. java multithreading concept is implemented using the following two models:
 * 		a) Green thread model
 * 		b) Native OS model

 
a) Green thread model:
the thread that is managed by jvm without taking underlying OS support is called
green thread.
--> very few OS like sun solaries support for green thread, anyway green thread model
  		is deprecated and not recommended to use.
  		
b) Native OS model:
the thread which is managed by jvm with the help of underlying OS, is called
 	native OS model.
--> all windows based operating systems provide support for native OS model.

========================================================================================
--> we can stop a thread execution by using stop() method of Thread class.
				_____________________________
				| public void stop()        |
				+---------------------------+
--> if call stop() method, then immediately the thread will enter into dead state.
 		Anyway stop() method is depricated and not recommended to use.
 		
========================================================================================
How to suspend and resume of Thread
--> we can suspend a thread by using suspend() method of thread class,
 		then immediately the thread will enter into suspended state.
--> we can resume a suspended thread by using resume() method of Thread class,
 		then suspended thread can continue its execution.
		 		______________________________
		 		| public void suspend()      |
		 		+----------------------------+
				| public void resume()       |
		 		+----------------------------+
--> anyway these methods are depricated and not recommended to use.		 
 */
}
