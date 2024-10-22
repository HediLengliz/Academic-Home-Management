package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repositories.ChamberRepository;

@Service
@AllArgsConstructor
public class ChamberService implements  IChamberService {

    ChamberRepository chamberRepository;
}
