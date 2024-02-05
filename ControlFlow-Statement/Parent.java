public class Parent {

   void PrintData() {
      System.out.println("method of parent class");
   }
}

class Child extends Parent {
   void PrintData() {
      System.out.println("method of child class");
   }
}

class UpcastingExample {
   public static void main(String args[]) {

      Parent obj1 = (Parent) new Child();
      Parent obj2 = (Parent) new Child();
      Child objChild = new Child();
      Parent objParent  = new Parent();
      Child c = (Child) new Parent(); // ClassCastException
      obj1.PrintData();
      obj2.PrintData();
      objChild.PrintData();
      objParent.PrintData();
      c.PrintData();
   }
}
