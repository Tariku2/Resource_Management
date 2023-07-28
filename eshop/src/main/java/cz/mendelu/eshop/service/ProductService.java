package cz.mendelu.eshop.service;

import cz.mendelu.eshop.dao.Product;
import cz.mendelu.eshop.service.dto.ProductDto;

import java.util.List;

public interface ProductService {

    List<ProductDto> getAll();

    void createProduct(ProductDto product);

}
