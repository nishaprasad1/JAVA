package _08_multithreading;

public class _11_Producer_consumer_problem {
/*
 * 1. producer thread is responsible to produce items to the queue, and consumer
 * 		thread is responsible to consume items from queue.
 * --> if the queue is empty consumer thread will call wait() method on queue 
 * 		object and enter into waiting state.
 * --> after producing items to the queue producer thread is responsible to call
 * 		notify() method, then waiting consumer will get that notification and 
 * 		continue its execution with updated items.

 _____________________                                                           ____________________
 |	Producer Thread  |    --->--->----------->>>+     +---->------>------->----->| Consumer Thread  |   
 +-------------------+                          |    /|\                         +------------------+     	             
                                               \|/ 	  |                                     
 	                                      +--+--+--+--+--+ 							class ConsumerThread{
 	class ProducerThread{                 |--+--+--+--+--|                              consume(){
 		produce(){                        |--+--+--+--+--|                                 synchornized(q){
 			synchornized(q){              |--+--+--+--+--|										if(q is empty)		
 				produce items to          +--+--+--+--+--+                                         q.wait();
 				the queue.                     Queue                                             else
 				q.notify();                                                                         consume items
 			}                                                                               }
 		}                                                                                }
 	}                                                                                }

 * 2. we can use notify() method to give the notification for only one waiting
 * 		thread, if multiple threads are waiting then only one thread will be notified
 * 		and remaining threads have to wait for furthure notifications. Which thread will
 * 		be notified we cannot expect it depends on jvm.
 * --> we can use nofityAll() to give notification for all waiting threads of
 * 		a particular object, even though multiple threads notified but execution
 * 		will be performed one by one because threads required lock and only one
 * 		lock is available.
 * (let say 60 threads are waiting, and all get notifyAll() notification then these
 * 	60 threads will continue their execution one after another as there is only one lock,
 * 	but yes which thread will get execute when that is randomly done by jvm according
 * 	to its scheduling algorithm).
 * 
 *  --> on which object we are calling wait() method thread required the lock of 
 *  		that particular object. for example if we calling wait() method on 
 *  		s1, then we have to get lock of s1 object but not s2 object.

							Stack s1 = new Stack();
							Stack s2 = new Stack();
				
		synchronized(s1){           |         synchronized(s1){     
			                        |
			s2.wait();	            |             s1.wait();
		}                           |         }
                                    |  
   RE: IllegalMonitorStateException	|       valid
   
 */
}
