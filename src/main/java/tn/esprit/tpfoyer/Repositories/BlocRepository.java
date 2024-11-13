package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Bloc;


@Repository
public interface BlocRepository extends JpaRepository<Bloc,Long>
{

}
