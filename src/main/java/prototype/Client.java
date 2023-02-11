package prototype;

public class Client {
    public static void main(String[] args) {
        concretePrototype();
        System.out.println("\n\n");
        subClassPrototype();
    }

    private static void subClassPrototype() {
        SubClassPrototype subClassPrototype = new SubClassPrototype("sub");
        SubClassPrototype cloneSubClassPrototype = (SubClassPrototype) subClassPrototype.clone();
        System.out.println("subClassPrototype=" + subClassPrototype);
        System.out.println("cloneSubClassPrototype=" + cloneSubClassPrototype);
    }

    private static void concretePrototype() {
        ConcretePrototype concretePrototype = new ConcretePrototype("con");
        ConcretePrototype cloneCon = (ConcretePrototype) concretePrototype.clone();
        System.out.println("concretePrototype=" + concretePrototype);
        System.out.println("cloneCon=" + cloneCon);
    }
}
