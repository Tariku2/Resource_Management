package cz.mendelu.eshop.service;

import cz.mendelu.eshop.dao.Product;
import cz.mendelu.eshop.dao.ProductDAO;
import cz.mendelu.eshop.service.dto.ProductDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDAO pDAO;

    public ProductServiceImpl(ProductDAO pDAO) {
        this.pDAO = pDAO;
    }

    @Override
    public List<ProductDto> getAll() {
        List<ProductDto> results = new ArrayList<>();
        List<Product> products = pDAO.findAll();
        for (Product p : products) {
            ProductDto dto = new ProductDto();
            dto.setBrand(p.getBrand());
            dto.setId(p.getId());
            dto.setModel(p.getModel());
            dto.setPrice(p.getPrice());
            dto.setName(p.getName());
            dto.setSizeX(p.getSizeX());
            dto.setSizeY(p.getSizeY());
            dto.setSizeZ(p.getSizeZ());
            dto.setWeight(p.getWeight());
            results.add(dto);
        }
        return results;
    }

    @Override
    public void createProduct(ProductDto dto) {
        Product p = new Product();
        p.setBrand(dto.getBrand());
        p.setId(dto.getId());
        p.setModel(dto.getModel());
        p.setPrice(dto.getPrice());
        p.setName(dto.getName());
        p.setSizeX(dto.getSizeX());
        p.setSizeY(dto.getSizeY());
        p.setSizeZ(dto.getSizeZ());
        p.setWeight(dto.getWeight());

        pDAO.save(p);
    }

}
