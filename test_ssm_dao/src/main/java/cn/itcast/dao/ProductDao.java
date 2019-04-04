package cn.itcast.dao;

import cn.itcast.domain.Product;

import java.util.List;

public interface ProductDao {
    List<Product> findAll()throws Exception;

    void saveProduct(Product product);

    void delProduct(Integer id);

    Product findById(String id);
}
