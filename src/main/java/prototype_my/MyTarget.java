package prototype_my;

public class MyTarget implements Cloneable{

    private String filed1;

    public MyTarget(String filed1) {
        this.filed1 = filed1;
    }

    //    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public MyTarget clone() throws CloneNotSupportedException {
        return (MyTarget)super.clone();
    }

    public String getFiled1() {
        return filed1;
    }

    public void setFiled1(String filed1) {
        this.filed1 = filed1;
    }

    @Override
    public String toString() {
        return "MyTarget{" +
                "filed1='" + filed1 + '\'' +
                '}';
    }
}
