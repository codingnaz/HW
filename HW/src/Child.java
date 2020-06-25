public class Child extends parent {
    public void print(){
        System.out.println(say());
    }
    public void printSuper(){
        super.print();
    }
    public String say(){
        return "This is child class";
    }
}
