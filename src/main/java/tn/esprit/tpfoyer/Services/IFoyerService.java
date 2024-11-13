package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entities.Foyer;

import java.util.List;

public interface IFoyerService {
    List<Foyer> retrieveAllFoyers();
    Foyer retrieveFoyer(Long foyerId);
    Foyer addFoyer(Foyer foyer);
    void removeFoyer(Long foyerId);
    Foyer modifyFoyer(Foyer foyer);
}
