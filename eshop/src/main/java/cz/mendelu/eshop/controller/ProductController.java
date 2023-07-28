package cz.mendelu.eshop.controller;

import cz.mendelu.eshop.service.ProductService;
import cz.mendelu.eshop.service.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(method = RequestMethod.GET, value = "/products", produces = "application/json")
    @ResponseBody
    public List<ProductDto> getProduct() {
        return productService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/products", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductDto dto) {
        productService.createProduct(dto);
    }

}
