package _08_multithreading;

public class _Thread_lifecycle {
/*
 * Simple thread cycle:
 * 

      MyThread t = new MyThread();                                                                                        +-------+
	      +-------------+                         +-------------+                          +---------+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+

==========================      
 
 
                                                                     Thread.yield();
                                                        +---------------------------------------+
                                                        |                                      /|\
     MyThread t = new MyThread();                      \|/                                      |                         +-------+
	      +-------------+                         +-----|-------+                          +----|----+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+

==========================

    
    
    
          	                                            __________________________
	      	                                            |    waiting state       |
	      	                           			   	 +--|    (Blocked for        |
	      	                                         |  |       joining)         |<-------------+
      	                                             |  |________________________|             /|\
      	                                             |                                          |   
      	                                             |1.if t2 completes. (or)                   |  t2.join();
      	                                             |2.if time expires. (or)                   |  t2.join(1000);
      	                                             |3.if waiting thread got interrupted.      |  t2.join(1000,100);
      	                                             |                                          |
      	      MyThread t = new MyThread();          \|/                                         |                         +-------+
	      +-------------+                         +--|----------+                          +----|----+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+

============================




                             							__________________________
	      	                           			   	 +--|                        |
	      	                                         |  |    sleeping state      |<-------------+
      	                                             |  |________________________|             /|\
      	                                             |                                          |   
      	                                             |1.if time expires. (or)                   |  Thread.sleep(1000);
      	                                             |2.if sleeping thread got interrupted.     |  Thread.sleep(1000,100);
      	                                             |                                          |
      	      MyThread t = new MyThread();          \|/                                         |                         +-------+
	      +-------------+                         +--|----------+                          +----|----+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+



============================


        															  ________________
	      	                           			   	        		  |    	         |
	      	                                         +<<<-------------| waiting state|<----------+
      	                                             |                |______________|         	/|\
      	                                             |                                           |   
      	                                             |1.if waiting thread get notification. (or) |  obj.join();
      	                                             |2.if time expires. (or)                    |  obj.join(1000);
      	                                             |3.if waiting thread got interrupted.       |  obj.join(1000,100);
      	                                             |                                           |
      	                                            \|/                                          |
      	                                 +------------------------------+                        |
      	                                 |another waiting state         |                        |
      	                                 |(to get lock on that object)  |                        |                                       
      	                                 +------------------------------+                        |                                       
      	                                             |                                           |                                       
      	                                             |                                           |                                       
      	      MyThread t = new MyThread();          \|/                                          |                         +-------+
	      +-------------+                         +--|----------+                          +-----|---+    if run()        |       | 
	      |  New/       |          t.start();     | Ready/      |  if Thread scheduler     | Running |------------------->| Dead  |        
	      |  Born       |------------------------>| Runnable    |------------------------->|         | method completes   |       |
	      +-------------+                         +-------------+    allocates processor   +---------+                    +-------+


 */
}
