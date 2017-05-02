
package exercisechap4ocapractice;


public class Koalatest {

    protected static final int one;
    protected static final int two;
    protected static final int three=3;
    protected static final int four;
    
     static{                  // They should be run when class is run first.
        one=1;
        two=4;
     // three=3;              we cant initialize three again because it is declared with final once .now its second attempt.
        four=5;
        System.out.println("I am Static - initializer runnnig first when class loads in JVM");
        System.out.println("---------------------------------------------"+"\n");
    }
    
    public static void main(String[] args) {
  
      Koala.main(new String[0]);    //  As main Method is Static ,we can also call main method .
      
      Koala object=new Koala();
      System.out.println(object.count);     //calling a static variable.
      
      object=null;
      System.out.println(object.count);   //Since Count is static variable so its value isnt affected.
      System.out.println("---------------------------------------------"+"\n");
      
      // Example 2: Static Concept is Important.
      
      Koala.count=4;
      Koala object1=new Koala();
      Koala object2=new Koala();
      Koala object3=new Koala();
      
      object1.count=6;
      object2.count=7;
      object3.count=8;
      
      System.out.println(Koala.count);      //Since thr is only one Count variable and All the Koala variables are distraction.
                                            //so output will be 8.
      System.out.println("---------------------------------------------"+"\n");
      
       Koala.method1();
      
      
      
    }

    
    
}
