package clubs.com.example.clubs.Service;

import java.util.List;

public interface IBaseService<T> {
    List<T> getAll();
    void save(final T t);
    void update(T t);
    void delete(List<T> t);
}
