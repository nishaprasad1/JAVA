package _13_java_lang_package;

/*

7. wait(), notify(), notifyAll()

--> we can use these methods for inter-thread communication.
--> the thread which is expecting updation, it is responsible to call wait() method
	then immediately the thread will enter into waiting state
--> the thread which is responsible to perform updation, after performing updation 
	the thread can call notify() method. The waiting thread will get notification
	and continue its execution with those updates.

 */
public class _07_wait_notify_notifyAll {

}
