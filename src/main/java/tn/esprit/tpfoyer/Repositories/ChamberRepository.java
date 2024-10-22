package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Chambre;
;
@Repository
public interface ChamberRepository extends CrudRepository<Chambre,Long> {
}
