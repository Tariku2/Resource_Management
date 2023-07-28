package cz.mendelu.eshop.dao;

import java.util.List;

public interface ProductDAO {
    List<Product> findAll();
    void save(Product Product);
    void delete(Product Product);
    Product findById(Long id);
}
