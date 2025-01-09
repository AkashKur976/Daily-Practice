interface X{
    int x = 10;
    void add();
    void sub();
}
interface Y{
    int y = 20;
    void mul();
    void div();
}
interface Z extends X,Y{

}
class Calculator implements Z{
    public void add(){
        System.out.println(X.x + Y.y);
    }
    public void sub(){
        System.out.println(X.x - Y.y);
    }
    public void mul(){
        System.out.println(X.x * Y.y);
    }
    public void div(){
        System.out.println(Y.y / X.x);
    }
}
public class InterfaceExample{
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        X a = c1;
        a.add();
        a.sub();

        Y b = c1;
        b.mul();
        b.div();

        Z c = c1;
        c.add();
        c.mul();

    }
}