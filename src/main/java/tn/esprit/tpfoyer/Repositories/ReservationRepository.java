package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation,String> {
}
