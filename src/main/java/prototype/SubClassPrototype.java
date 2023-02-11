package prototype;

public class SubClassPrototype extends ConcretePrototype{

    private String field2;

    public SubClassPrototype(String field2) {
        super(field2);
    }

    @Override
    public Prototype clone() {
        return new SubClassPrototype(this.field2);
    }


    //getter, setter, toString
    //===========================================================

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public String toString() {
        return "SubClassPrototype{" +
                "field2='" + field2 + '\'' +
                '}';
    }
}
