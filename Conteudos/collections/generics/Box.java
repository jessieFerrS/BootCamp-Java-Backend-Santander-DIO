package collections.generics;

public class Box<T> {
    // T => tipo
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t; // retorna o tipo passado no generics
    }
}
