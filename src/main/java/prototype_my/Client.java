package prototype_my;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyTarget myTarget = new MyTarget("20230211토요일");
        MyTarget cloneTarget = myTarget.clone();

        System.out.println("[before change]");
        System.out.println("myTarget = " + myTarget.toString());
        System.out.println("cloneTarget = " + cloneTarget.toString());


        System.out.println("\n\n\n\n");
        cloneTarget.setFiled1("i am clone");
        System.out.println("[after change]");
        System.out.println("myTarget = " + myTarget.toString());
        System.out.println("cloneTarget = " + cloneTarget.toString());



    }
}
