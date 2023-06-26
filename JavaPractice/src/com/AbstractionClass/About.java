package com.AbstractionClass;

public class About {

}
/*
   Abstraction--Is the process of hiding the Implementation details and showing 
   only the functionality to the user.
*/

//<<<<<<---------------------------------------------------------------->>>>>

//Abstraction can be achieved through only Interfaces.
/*We cannot Implement 100% Methods here, lets say we will implement 8 out of 10 methods 
   in the abstract class, the remaining two methods will be named as abstract methods in that
   class.
   If you want to implement the interface partially, so we can go with abstract class and 
   methods in the abstract class.
   
-->If you implement the Interface methods in class,you need to implement all -before 1.8,
     so we will use the abstraction concept before 1.8 version.
-->You are not supposed to do any implementation in interfaces before 1.8 version.
    
-->This abstraction would lie between Interface and class.

--> In Interface will have only abstract methods and In class will have Complete Implementation.
    so. both will combine and together we call it as Abstract class. If there is any 
    Implementation would happens that must be a class, so java came up with a solution known
    as Abstraction class.
    
    Abstract Class = Interface Methods + Class Implementation
    
    so, we will keep abstract as keyword in class. so java will tell to the compiler that
    it may contains the abstract methods also.
    
--> Abstract class must contain abstract keyword. same follows as method.

-->If you want to keep any methods as abstract the class must be abstract class.

*/