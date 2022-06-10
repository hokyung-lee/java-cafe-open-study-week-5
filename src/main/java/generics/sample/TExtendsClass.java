package generics.sample;

import java.io.Serializable;

public class TExtendsClass<T extends Number> {
    T value;
    public TExtendsClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
