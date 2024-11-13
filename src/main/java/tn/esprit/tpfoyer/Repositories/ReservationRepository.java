package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer.Entities.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
