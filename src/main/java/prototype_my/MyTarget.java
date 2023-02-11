package prototype_my;

public class MyTarget implements Cloneable{

    private String filed1;

    public MyTarget(String filed1) {
        this.filed1 = filed1;
    }

    // 인텔리제이가 생성해주는 clone() 인데 타입을 Object 쓰지말고 꼭 구체클래스로 다운캐스팅 해라
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
