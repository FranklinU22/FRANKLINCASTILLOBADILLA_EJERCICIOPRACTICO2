package com.caso02.caso02.ServiceImpl;

import com.caso02.caso02.Service.IBaseService;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public class BaseService<T,Y> implements IBaseService<T, Y>{
    protected final CrudRepository<T, Y> repository;

    public BaseService(CrudRepository<T, Y> repository) {
        this.repository = repository;
    }

    public List<T> getAll() {
        return (List<T>) this.repository.findAll();
    }

    public T save(T item) {
        return this.repository.save(item);
    }

    public Optional<T> getById(Y id) {
        return this.repository.findById(id);
    }

    public void delete(T item) {
        this.repository.delete(item);
    }
}
