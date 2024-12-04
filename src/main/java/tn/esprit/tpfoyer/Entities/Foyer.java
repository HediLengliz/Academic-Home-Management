package tn.esprit.tpfoyer.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long CapaciteFoyer;


    @OneToOne(mappedBy = "foyer", cascade = CascadeType.ALL)
    private Universite universite;
    @OneToMany(mappedBy = "foyer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Bloc> blocs;

}
