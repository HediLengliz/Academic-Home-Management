package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Entities.Etudiant;
import tn.esprit.tpfoyer.Entities.Reservation;
import tn.esprit.tpfoyer.Repositories.ChambreRepository;
import tn.esprit.tpfoyer.Repositories.EtudiantRepository;
import tn.esprit.tpfoyer.Repositories.ReservationRepository;

import java.util.HashSet;
import java.util.List;

@Service
@AllArgsConstructor
public class ChambreService implements IChambreService {

    private final ReservationRepository reservationRepository;
    private final EtudiantRepository etudiantRepository;
    private final  ChambreRepository chambreRepository;
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }
    public Chambre retrieveChambre(Long chambreId) {
        return chambreRepository.findById(chambreId).orElseThrow(() -> new RuntimeException("chamber not found"));
    }
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }
    public void removeChambre(Long chambreId) {
        chambreRepository.deleteById(chambreId);
    }
    public Chambre modifyChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }
    public List <Chambre> findChambreByEtudiant(Long cin,Long idBloc) {
        return chambreRepository.findChambreByEtudiant(cin,idBloc);
    }

}
