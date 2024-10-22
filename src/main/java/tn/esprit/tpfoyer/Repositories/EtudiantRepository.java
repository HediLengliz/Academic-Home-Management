package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Etudiant;

@Repository
public interface EtudiantRepository extends CrudRepository<Etudiant,Long> {
}
