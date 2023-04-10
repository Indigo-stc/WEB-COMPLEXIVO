package com.ista.costumes.service;

import com.ista.costumes.repositorio.BaseRepo;
import org.springframework.beans.BeanUtils;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T, ID extends Serializable> implements BaseService<T, ID> {

    private final BaseRepo<T, ID> baseRepository;

    public BaseServiceImpl(BaseRepo<T, ID> baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public List<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return baseRepository.findById(id);
    }

    @Override
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public List<T> saveAll(List<T> detalles) {
        return baseRepository.saveAll(detalles);
    }

    @Override
    public T update(T t, ID id) {
        Optional<T> current = baseRepository.findById(id);
        if (current.isPresent()) {
            T entity = current.get();
            BeanUtils.copyProperties(t, entity);
            return baseRepository.save(entity);
        }
        return null;
    }

}
