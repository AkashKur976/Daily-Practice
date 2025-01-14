class A implements AutoCloseable{
    A(){
        System.out.println("*** Allocating the resources for the A object ***");
    }
    public void process(){
        System.out.println("Processing in object of A");
    }
    public void close(){
        System.out.println("*** Releasing the resources for the A object ***");
    }
}
class B implements AutoCloseable{
    B(){
        System.out.println("*** Allocating the resources for the B object ***");
    }
    public void process(){
        System.out.println("Processing in object of B");
    }
    public void close(){
        System.out.println("*** Releasing the resources for the B object ***");
    }
}
public class TryWithResources{
    public static void main(String args[]){
        try(A a1 = new A(); B b1 = new B();){
            b1.process();
            if(true)
                throw new NullPointerException();
            a1.process();
            
        }       
        catch(NullPointerException e){
            e.printStackTrace();
        }
        System.out.println("The program continues .......");
    }
}