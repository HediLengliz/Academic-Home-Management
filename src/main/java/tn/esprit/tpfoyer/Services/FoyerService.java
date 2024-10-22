package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repositories.FoyerRepository;

@Service
@AllArgsConstructor
public class FoyerService implements  IFoyerService {

    FoyerRepository foyerRepository;
}
