public interface Repository<T, V> {
    public default void register(T e){
        return;
    }
    public default T findById(V id){
        return null;
    }
}
