package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Universite;

@Repository
public interface UniversiteRepository extends CrudRepository<Universite,Long> {

}
