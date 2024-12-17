package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.Entities.Reservation;

import java.util.List;

public interface IChambreService {

    public List<Chambre> retrieveAllChambres();
    public Chambre retrieveChambre(Long chambreId);
    public Chambre addChambre(Chambre c);
    public void removeChambre(Long chambreId);
    public Chambre modifyChambre(Chambre chambre);
    List <Chambre> findChambreByEtudiant(Long idEtudiant);
//    public Chambre addChambreWithReservationAndEtudiant(Chambre chambre, Long etudiantCIN, Long reservationId);
}
