package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Foyer;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer,Long> {
}
