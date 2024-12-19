package tn.esprit.tpfoyer.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.Entities.Reservation;

import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
    @Query("SELECT c FROM Chambre c JOIN c.reservations r JOIN r.etudiants e WHERE e.cin = :cin AND c.bloc.idBloc = :idBloc")
    List<Chambre> findChambreByEtudiant(@RequestParam Long cin, @RequestParam Long idBloc);

}
