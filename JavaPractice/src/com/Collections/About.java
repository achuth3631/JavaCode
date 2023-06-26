package com.Collections;

public class About {

}

/*

 -->About ArrayList and Vector :



List-->Vector(1.0)--default array size is 10 
               --If you try to add the extra values in array, size gets auto increased.
               --It will automatically increases by double the size or 100% size.
               --Depends on elements it will gets auto Increment/Decrement.
               Vector v = new Vector();
               --If multiple threads came it can handle only one by one(No synchronization)

     -->ArrayList--Same as Vector, But size will increase only 50%.
                 --Default array is 0, if you add 1 element--size becomes 10.
                 --Initially without adding elements the size is zero.
                 --If multiple threads came it can handle all at a time.(Synchronization).
                 --Synchronization can be achieved by explicitly by developers.
                      ---> Collections.synchronized(listName); <---
                 --Best for data storing and retrieving.

     -->StackList(1.0)--class--extends the vector--Same as vector
                 --ALways we have to create an empty stack
                 --some additional features is there
                 --Stack provides some methods which we can only use in stack.
                 --It implements Last In First Out (LIFO)
                 --Methods-->push,pop,peek(you want to see the last inserted element)
                             ,search(Top to bottom)--starts from 1--top to bottom
                 --Best for LIFO operations.

     -->LinkedList--It also implements the List Interface and Dequeue Interface.  
                  --There is no arrays concept in linkedlist.
                  --we will use node concept.
                  --By default the size is zero.first and last elements in the node is NULL.
                  --Prev,dataItem.Next
                  --We can create an empty LL or create with data.
                  --Synchronization can be achieved by explicitly by developers.
                      ---> Collections.synchronized(listName); <---
                  --Duplicates and Nulls allowed.
                  --Default and Initial capacity--zero
                  --Best for data manipulations.


Map---> Map is a  Interface provided by the Collections framework.
    --Map cannot create object. But It will create objects on implemented classes for Map interface.
    --Map<String,Integer> m = new Map<Integer,String>();---
    --retrieval of keys--keySet(); and values--Values();




Queue---> FIFO
         --Allows duplicates-not allowed nulls
        --First In First Out--Default size is 11.
   

      PriorityQueue--based on the priority it will be executed
           ----PriorityQueue<Integer> pq = new PriorityQueue<Integer>();----
               Addition->add(),offer()
               Removal->poll(),remove()
               Retrieval->peek  

          -In the head position it will be printing the highest priority. i.e., least Integer have high priority.
          --Queue is always pointing to highest priority first.
          --poll-(removes the element which is in head and prints all other elements )
          --We can retrieve only head element. 
          --If the list is empty, If we use remove--we get exception
		  --If the list is empty, If we  use poll---we get null
		  --Add elements into the queue--offer,add
		  --Retrieval of elements--Peek
		  --Removal of elements--Poll, remove




      ArrayDeque--Default is 17 size.
                --You can perform insertion and deletion in both ends(Header and tail).
                 --Add elements into the queue--offer,add,offerFirst, offerLast,addFirst, addLast
		         --Retrieval of elements--Peek,peekFirst,peekLast
		          --Removal of elements--Poll, remove, pollFirst, pollLast
		          
SET-->It is having a unique nature that doesn't allow duplicates.
   --We cannot create objects for set. but we can create objects on implemented classes for set Interface.
   --Set will store only key values. and Dummy object will be stored in value.
   --The size of Hashmap is 16.
   
   1. HashSet-->(use) HashArray -->(Use) Array of nodes(Key, value)--Doesn't follow Insertion order.--Nills allowed
           Default capacity-0   Initial Capacity-16
   2. Linkedhashset-->It follows the insertion order--Nulls allowed
                      Default capacity-16   Initial Capacity-16

   3. TreeSet-->TreeMap--Binary Tree--Nulls not allowed
        --It is useful that elements are stored in sorted order.
                  Default capacity-0   Initial Capacity-0

   
 */ 











