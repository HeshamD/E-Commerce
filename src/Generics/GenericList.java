package Generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericList<T> implements Iterable<T>{
    private List<T> items = new ArrayList<T>();

    public void add(T item){
        items.add(item);
    }

    public T get(int index){
        return items.get(index);
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorList(this);
    }

    private class IteratorList implements Iterator<T>{
        private int index;
        private GenericList<T> list;
        public IteratorList(GenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            if(index < list.items.size()) return true;
            return false;
        }

        @Override
        public T next() {
            return list.items.get(index++);
        }
    }

}
