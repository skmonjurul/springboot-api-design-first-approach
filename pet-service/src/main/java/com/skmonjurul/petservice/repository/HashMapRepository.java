package com.skmonjurul.petservice.repository;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.util.Assert;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


@NoRepositoryBean
public abstract class HashMapRepository<T, ID> implements CrudRepository<T, ID> {

    private final BeanWrapper entityBeanInfo;

    Map<ID, T> entities = new ConcurrentHashMap<>();

    protected HashMapRepository(Class<T> clazz) {
        entityBeanInfo = new BeanWrapperImpl(clazz);
    }

    abstract <S extends T> ID getEntityId(S entity);


    @Override
    public <S extends T> S save(S entity) {
        Assert.notNull(entity, "entity can not be null");
        Assert.notNull(getEntityId(entity), "entity ID can not be null");
        entities.put(getEntityId(entity), entity);

        return entity;
    }


    @Override
    public <S extends T> List<S> saveAll(Iterable<S> entities) {
        Assert.notNull(entities, "Entities can not be null");
        List<S> result = new ArrayList<>();
        entities.forEach(entity -> result.add(save(entity)));

        return result;
    }


    @Override
    public Collection<T> findAll() {
        return entities.values();
    }


    @Override
    public long count() {
        return entities.keySet().size();
    }


    @Override
    public void delete(T entity) {
        Assert.notNull(entity, "Entity can not be null");
        deleteById(getEntityId(entity));
    }


    @Override
    public void deleteById(ID id) {
        Assert.notNull(id, "ID can not be null");
        entities.remove(id);
    }


    @Override
    public void deleteAll(Iterable<? extends T> entitiesToBeDeleted) {
        Assert.notNull(entitiesToBeDeleted, "Entities can not be null");
        entitiesToBeDeleted.forEach(entity -> entities.remove(getEntityId(entity)));
    }


    @Override
    public void deleteAllById(Iterable<? extends ID> ids) {
        Assert.notNull(ids, "Ids can not be null");
        ids.forEach(this::deleteById);
    }

    @Override
    public void deleteAll() {
        entities.clear();
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(findOne(id));
    }

    @Override
    public boolean existsById(ID id) {
        Assert.notNull(id, "Id can not be null");
        return entities.containsKey(id);
    }

    @Override
    public List<T> findAllById(Iterable<ID> ids) {
        Assert.notNull(ids, "Ids can not be null");
        List<T> result = new ArrayList<>();

        ids.forEach(id -> findById(id).ifPresent(result::add));

        return result;
    }


    public T findOne(ID id) {
        Assert.notNull(id, "Id can not be null");
        return entities.get(id);
    }

}
