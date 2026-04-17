public interface Repository<T, V> {
    boolean register(T e);
    T findById(V id);
}
