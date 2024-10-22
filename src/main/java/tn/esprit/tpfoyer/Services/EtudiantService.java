package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repositories.EtudiantRepository;

@Service
@AllArgsConstructor
public class EtudiantService implements  IEtudiantService {

    EtudiantRepository etudiantRepository;
}
