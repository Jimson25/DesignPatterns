package iterator;

import java.util.Vector;

public class ConcreteIterator<T> implements Iterator<T> {
    private Vector<T> vector ;
    //定义当前游标
    public int cursor = 0;
    public ConcreteIterator(Vector<T> _vector){
        this.vector = _vector;
    }

    @Override
    public T next() {
        T result = null;
        if(this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
