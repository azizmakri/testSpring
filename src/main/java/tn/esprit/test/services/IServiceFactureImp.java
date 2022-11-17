package tn.esprit.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.test.entities.Client;
import tn.esprit.test.entities.DetailFacture;
import tn.esprit.test.entities.Facture;
import tn.esprit.test.repositories.ClientRepository;
import tn.esprit.test.repositories.DetailFactureRepository;
import tn.esprit.test.repositories.FactureRepository;

import java.util.List;

@Service
public class IServiceFactureImp implements IServiceFacture{
    @Autowired
    FactureRepository factureRepository;
    @Autowired
    ClientRepository clientRepository;

    @Autowired
    DetailFactureRepository detailFactureRepository;

    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture facture= factureRepository.findById(id).orElse(null);
        if (facture!=null){
            facture.setActive(false);
            factureRepository.save(facture);
        }

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public Facture addFacture(Facture f) {
        return factureRepository.save(f);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c=clientRepository.findById(idClient).orElse(null);
        return factureRepository.findFactureByClient(c);
    }

    @Override
    public Facture addFacture2(Facture f, Long idClient) {
        List<DetailFacture> detailFactures=detailFactureRepository.findDetailFactureByFacture(f);
        float prixTot=0;
        int montRem=0;
        for (DetailFacture de:detailFactures) {
            prixTot=+de.getPrixTotal();
            montRem=+de.getMontantRemise();
        }
        f.setMontantFacture(prixTot);
        f.setMontantRemise(montRem);
        return factureRepository.save(f);
    }
}
