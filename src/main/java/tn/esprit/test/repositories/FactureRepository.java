package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Client;
import tn.esprit.test.entities.Facture;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture,Long> {

    public List<Facture> findFactureByClient(Client c);
}
