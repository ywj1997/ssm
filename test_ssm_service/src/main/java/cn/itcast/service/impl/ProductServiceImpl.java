package cn.itcast.service.impl;

import cn.itcast.dao.ProductDao;
import cn.itcast.domain.Product;
import cn.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> findAll()throws Exception{
        return productDao.findAll();
    }

    @Override
    public void saveProduct(Product product) {
          productDao.saveProduct(product);
    }

    @Override
    public void delProduct(Integer id) {
        productDao.delProduct(id);
    }
}
