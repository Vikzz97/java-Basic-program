
interface ExampleInterface {
    // interface tells to class what to do ?
    // it supports multiple inheritance
    // it can be used to loop coupling 

    // methods - abstract, public
    // fields - public static final

    public void show();

}
class interfaceV implements ExampleInterface{

    public void show(){
        System.out.println("Interface achieved");
    }
    public static void main(String[] args) {
        interfaceV v = new interfaceV();
        v.show();
    }
}

