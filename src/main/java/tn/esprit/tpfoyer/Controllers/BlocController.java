package tn.esprit.tpfoyer.Controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.Entities.Bloc;
import tn.esprit.tpfoyer.Services.BlocService;
import tn.esprit.tpfoyer.Services.IBlocService;

import java.util.List;
@Tag(name= "Gestion Bloc")
@RestController
@RequestMapping("/bloc")
@AllArgsConstructor
public class BlocController {
    private final BlocService blocService;

    IBlocService iBlocService;
    @Operation(description = "Get all blocs")
    @GetMapping("/retrieve-all-blocs")
    public List<Bloc> getBlocs() {
        return blocService.retrieveAllBlocs();
    }

    @GetMapping("/retrieve-bloc/{bloc-id}")
    public Bloc retrieveBloc(@PathVariable("bloc-id") Long blocId) {
        return blocService.retrieveBloc(blocId);
    }

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void removeBloc(@PathVariable("bloc-id") Long blocId) {
        blocService.removeBloc(blocId);
    }

    @PutMapping("/modify-bloc")
    public Bloc modifyBloc(@RequestBody Bloc bloc) {
        return blocService.modifyBloc(bloc);
    }


}
