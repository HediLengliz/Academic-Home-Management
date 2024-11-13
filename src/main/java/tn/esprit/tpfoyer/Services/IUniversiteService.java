package tn.esprit.tpfoyer.Services;

import tn.esprit.tpfoyer.Entities.Universite;

import java.util.List;

public interface IUniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite retrieveUniversite(Long universiteId);
    Universite addUniversite(Universite universite);
    void removeUniversite(Long universiteId);
    Universite modifyUniversite(Universite universite);
}
