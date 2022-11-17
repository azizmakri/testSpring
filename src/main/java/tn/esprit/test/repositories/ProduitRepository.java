package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
