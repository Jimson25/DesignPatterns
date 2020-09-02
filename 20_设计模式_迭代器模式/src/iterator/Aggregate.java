package iterator;

public interface Aggregate<T> {
    //是容器必然有元素的增加
    public void add(T object);
    //减少元素
    public void remove(T object);
    //由迭代器来遍历所有的元素
    public Iterator<T> iterator();
}
