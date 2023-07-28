package repo;

import Entity.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fileUploadRepository extends JpaRepository<File,String> {



}
