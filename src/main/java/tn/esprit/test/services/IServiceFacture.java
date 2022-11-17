package tn.esprit.test.services;

import tn.esprit.test.entities.Facture;

import java.util.List;

public interface IServiceFacture {
    public List<Facture> retrieveAllFactures();
    public void cancelFacture(Long id);
    public Facture retrieveFacture(Long id);
    public Facture addFacture(Facture f);
    public List<Facture> getFacturesByClient(Long idClient);
    public Facture addFacture2(Facture f, Long idClient);
}
