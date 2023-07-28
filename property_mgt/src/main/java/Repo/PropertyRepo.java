package Repo;

import Entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyRepo extends JpaRepository<Property,Long> {
    Property findByPropertyId(Long PropertyId);
}
