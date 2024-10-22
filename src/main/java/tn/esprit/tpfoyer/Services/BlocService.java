package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Repositories.BlocRepository;

@Service
@AllArgsConstructor
public class BlocService implements  IBlocService {

    BlocRepository blocRepository;
}
