package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Foyer;

@Repository
public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
