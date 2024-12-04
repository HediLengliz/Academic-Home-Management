package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entities.Bloc;

import java.util.List;

public interface IBlocService {
    List<Bloc> retrieveAllBlocs();
    Bloc retrieveBloc(Long blocId);
    Bloc addBloc(Bloc bloc);
    void removeBloc(Long blocId);
    Bloc modifyBloc(Bloc bloc);
    void desaffecterBlocDeFoyer(Long blocId);
    List<Bloc> findAllByFoyerIsNull();
}
