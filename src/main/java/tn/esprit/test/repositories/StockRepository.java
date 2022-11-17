package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Stock;

public interface StockRepository extends JpaRepository<Stock,Long> {
}
