package tn.esprit.tpfoyer.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Entities.Foyer;
import tn.esprit.tpfoyer.Repositories.BlocRepository;
import tn.esprit.tpfoyer.Repositories.FoyerRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class BlocService implements  IBlocService {
    private final FoyerRepository foyerRepository;
    private final BlocRepository blocRepository;

    @Override
    @Scheduled(fixedRate = 1000)
    public List<Bloc> retrieveAllBlocs() {
        List<Bloc> blocs = blocRepository.findAll();
        log.info("Retrieved Blocs: {}", blocs);
        return blocs;
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).orElse(null);
    }

    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
    public Foyer creerBlocEtFoyer(Foyer foyer, Bloc bloc) {
        // Ajouter le bloc au foyer
        bloc.setFoyer(foyer);
        foyer.getBlocs().add(bloc);

        // Sauvegarder le foyer et son bloc
        return foyerRepository.save(foyer);
    }
    public void affecterBlocAFoyer(Long blocId, Long foyerId) {
        Bloc bloc = blocRepository.findById(blocId)
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé avec l'ID: " + blocId));
        Foyer foyer = foyerRepository.findById(foyerId)
                .orElseThrow(() -> new RuntimeException("Foyer non trouvé avec l'ID: " + foyerId));

        // Affectation du bloc au foyer
        bloc.setFoyer(foyer);
        foyer.getBlocs().add(bloc);

        // Mise à jour des deux entités
        blocRepository.save(bloc);
        foyerRepository.save(foyer);
    }
    public void desaffecterBlocDeFoyer(Long blocId) {
        Bloc bloc = blocRepository.findById(blocId)
                .orElseThrow(() -> new RuntimeException("Bloc non trouvé avec l'ID: " + blocId));

        if (bloc.getFoyer() != null) {
            Foyer foyer = bloc.getFoyer();
            foyer.getBlocs().remove(bloc);
            bloc.setFoyer(null);

            // Sauvegarder les deux modifications
            foyerRepository.save(foyer);
            blocRepository.save(bloc);
        } else {
            throw new RuntimeException("Le bloc n'est pas affecté à un foyer.");
        }
    }

    @Override
    public List<Bloc> findAllByFoyerIsNull() {
        return blocRepository.findAllByFoyerIsNull();
    }

}
