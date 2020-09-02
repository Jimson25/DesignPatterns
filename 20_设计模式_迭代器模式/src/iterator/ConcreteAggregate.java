package iterator;

import java.util.Vector;

public class ConcreteAggregate<T> implements Aggregate<T> {
    //容纳对象的容器
    private final Vector<T> vector = new Vector<T>();


    @Override
    public void add(T object) {
        this.vector.add(object);
    }

    @Override
    public void remove(T object) {
        this.remove(object);
    }

    @Override
    public Iterator<T> iterator() {
        return new ConcreteIterator<>(this.vector);    }
}
