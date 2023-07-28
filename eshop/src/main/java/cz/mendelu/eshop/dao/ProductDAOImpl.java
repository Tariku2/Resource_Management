package cz.mendelu.eshop.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product findById(Long id) {
        try {
            return entityManager.find(Product.class, id);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void save(Product Product) {
        if (Product.getId() != null) {
            try {
                entityManager.merge(Product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                entityManager.persist(Product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Product Product) {
        try {
            entityManager.remove(findById(Product.getId()));
        } catch (Exception e) {
        }
    }

    @Override
    public List<Product> findAll() {
        try {
            return entityManager.createQuery("select c from Product c", Product.class).getResultList();
        } catch (Exception e) {
            return null;
        }
    }

}