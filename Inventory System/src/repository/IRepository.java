package repository;

import java.util.ArrayList;

public interface IRepository<T> {

    void save(T data);

    ArrayList<T> findAll();

}