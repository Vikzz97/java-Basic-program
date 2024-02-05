class Example12 {
    // 1.this keyword is used to invoke current class instance variable
    // 2.this keyword is used to invoke current class instance variable(implicity)
    // this() keyword can be used to invoke current class constructor
    // this keyword can be used to pass as an argument in the method call


    // int i; // 45

    // void display(){
    //     System.out.println("hello");
    // }
    // void show(){
    //     this.display(); //  display(); both are same
    // }
    // void ThisDemo(){
        
    //     System.out.println("This Demo Constructor Called!");
    // }
    // void ThisDemo(int a){
        
    //     System.out.println("Parameterized Constructor Called!");
    // }

    void m1(Example12 ex){
        System.out.println("Hello from m1! ");
    }
    void m2(){
        m1(this);
    }
    public static void main(String[] args) {
        Example12 e1 = new Example12();
        // e1.ThisDemo();
        // e1.ThisDemo();
        e1.m2();

    }
    
}

