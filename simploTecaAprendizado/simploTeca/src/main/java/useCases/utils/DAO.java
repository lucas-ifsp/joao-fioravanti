package useCases.utils;
import java.util.List;
import java.util.Optional;

public interface DAO<T, K> {
    K create(T obj);
    Optional<T> findOne(K key);
    List<T> findAll();
    boolean update(T obj);
    boolean deleteByKey(K key);
    boolean delete(T obj);
}
