package Service;

import Entity.Property;
import Repo.PropertyRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@RequiredArgsConstructor
@Transactional
@Slf4j
@Service
public class PropertyServiceImpl implements PropertyService{
    private PropertyRepo propertyRepo;

    @Override
    public Property add(Property property) {
        return propertyRepo.save(property);
    }

    @Override
    public Collection<Property> list(int limit) {
        return propertyRepo.findAll(Pageable.ofSize(limit)).toList();
    }

    @Override
    public Property get(Long id) {
        return propertyRepo.findById(id).get();
    }

    @Override
    public Property update(Property property) {
        return propertyRepo.save(property);
    }

    @Override
    public boolean delete(Long id) {
        return true;
    }
}
