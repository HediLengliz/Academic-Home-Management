package tn.esprit.tpfoyer.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Chambre;
import tn.esprit.tpfoyer.Services.ChambreService;
import tn.esprit.tpfoyer.Services.IChambreService;

import java.util.List;
@Tag(name= "Gestion Chambre")
@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {

    private final ChambreService chambreService;
    IChambreService iChambreService;
    // http://localhost:8089/tpfoyer/chambre/retrieve-all-chambres
    @Operation(description = "display all chambres")
    @GetMapping("/retrieve-all-chambres")
    public List<Chambre> getChambres() {
        return chambreService.retrieveAllChambres();

    }
    // http://localhost:8089/tpfoyer/chambre/retrieve-chambre/8
    @Operation(description = "display chambre by id")
    @GetMapping("/retrieve-chambre/{chambre-id}")
    public Chambre retrieveChambre(@PathVariable("chambre-id") Long chId) {
      return chambreService.retrieveChambre(chId);

    }
    // http://localhost:8089/tpfoyer/chambre/add-chambre
    @Operation(description = "add chambre")
    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addChambre(c);

    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}
    @Operation(description = "remove chambre by id")
    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void removeChambre(@PathVariable("chambre-id") Long chId) {
        chambreService.removeChambre(chId);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre
    @Operation(description = "modify chambre")
    @PutMapping("/modify-chambre")
    public Chambre modifyChambre(@RequestBody Chambre c) {
        return chambreService.modifyChambre(c);
    }
    @GetMapping("/findChambreByEtudiantAndReservation/{etudiantCIN}/{reservationId}")
    public List<Chambre> findChambreByEtudiantAndReservation(@PathVariable("etudiantCIN") long etudiantCIN, @PathVariable("reservationId") Long reservationId) {
        return chambreService.findChambreByEtudiantAndReservation(etudiantCIN, reservationId);
    }
}
