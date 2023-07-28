package Service;


import Entity.Property;

import java.util.Collection;

public interface PropertyService {
     Property add(Property property);
    Collection<Property> list(int limit) ;
    Property get(Long id);
    Property update(Property property);
    boolean delete(Long id);
}
