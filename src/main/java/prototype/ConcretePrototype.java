package prototype;

public class ConcretePrototype implements Prototype {

    private String field1;

    public ConcretePrototype(String field1) {
        this.field1 = field1;
    }

    @Override
    public Prototype clone() {
        //Prototype clone = (Prototype) super.clone();
        return new ConcretePrototype(this.field1);
    }



    //getter, setter, toString
    //===========================================================

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field1='" + field1 + '\'' +
                '}';
    }
}
