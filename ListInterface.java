public interface ListInterface<T> {
    public void add(T item) throws ListException;
    public void add(T item, int pos) throws ListException;
    public T get(int pos) throws ListException;
    public T set(T item, int pos) throws ListException;
    public int find(T item, int startPos, int endPos) throws ListException;
    public int size();
    public String toString();
    public T remove(int pos) throws ListException;
    public void clear();
    public Object toArray();
    public boolean isEmpty();
}

