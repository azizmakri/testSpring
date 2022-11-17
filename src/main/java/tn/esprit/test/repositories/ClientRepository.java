package tn.esprit.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.test.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}
