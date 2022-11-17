package tn.esprit.test.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.DetailFacture;
import tn.esprit.test.entities.Facture;

import java.util.List;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {

    public List<DetailFacture>findDetailFactureByFacture(Facture f);
}
