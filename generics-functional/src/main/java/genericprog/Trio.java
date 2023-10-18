package genericprog;

public class Trio<A,B,C> {

    private A prop1;
    private B prop2;
    private C prop3;

    public Trio(A prop1, B prop2, C prop3) {
        this.prop1 = prop1;
        this.prop2 = prop2;
        this.prop3 = prop3;
    }

    public A getProp1() {
        return prop1;
    }

    public void setProp1(A prop1) {
        this.prop1 = prop1;
    }

    public B getProp2() {
        return prop2;
    }

    public void setProp2(B prop2) {
        this.prop2 = prop2;
    }

    public C getProp3() {
        return prop3;
    }

    public void setProp3(C prop3) {
        this.prop3 = prop3;
    }

    @Override
    public String toString() {
        return "Trio{" +
                "prop1=" + prop1 +
                ", prop2=" + prop2 +
                ", prop3=" + prop3 +
                '}';
    }
}
