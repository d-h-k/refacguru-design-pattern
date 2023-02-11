package prototype;

public class ConcretePrototype implements Prototype {

    private String field1;

    //public ConcretePrototype(Prototype prototype) {
    public ConcretePrototype() {
        this.field1 = "???";
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype();
    }
}
