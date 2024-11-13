package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Long> {

}
