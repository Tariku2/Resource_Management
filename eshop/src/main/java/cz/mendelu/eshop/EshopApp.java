package cz.mendelu.eshop;

import cz.mendelu.eshop.dao.Customer;
import cz.mendelu.eshop.dao.Product;
import cz.mendelu.eshop.dao.ProductDAO;
import cz.mendelu.eshop.dao.ProductDAOImpl;
import cz.mendelu.eshop.service.ProductService;
import cz.mendelu.eshop.service.ProductServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EshopApp {

    public static void main(String[] args) {
//        ProductDAO pDAO = new ProductDAOImpl();
//        ProductService pService = new ProductServiceImpl(pDAO);

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean-configuration.xml");

        ProductService pService = ctx.getBean(ProductService.class);

        Product p = new Product("Home Laptop", null, "Siemens", 17000.0f, 40, 30, 4, 2.0f);

        Customer c = new Customer.Builder(null, "John", "Doe")
                .email("john@doe.com")
                .address("Zemendelska 1, Brno")
                .phoneNumber("+4205416548454")
                .birthday("01.01.2000.")
                .build();

        p.setCustomer(c);
    }

}
