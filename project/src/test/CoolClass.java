package test;

public class CoolClass<T> {
    private T outer;
    private T inner;

    public CoolClass(T outer, T inner) {
        this.outer = outer;
        this.inner = inner;
    }

    public T getOuter() {
        return outer;
    }

    public T getInner() {
        return inner;
    }

    public String toString() {
        return "CoolClass(" + outer.toString() + ":" + inner.toString() + ")";
    }
}
