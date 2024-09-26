package services;

import entities.Adresse;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SvcAdresse extends Service<Adresse> implements Serializable {

    // Déclaration des variables
    private static final Logger log = Logger.getLogger(SvcAdresse.class);
    private static final long serialVersionUID = 1L;
    Map<String, Object> params = new HashMap<String, Object>();

    public SvcAdresse()
    {
        super();
    }

    // Méthode qui permet de sauver une adresse et de la mettre en DB
    @Override
    public Adresse save(Adresse adresse) {
        if (adresse.getId() == 0) {
            em.persist(adresse);
        } else {
            adresse = em.merge(adresse);
        }

        return adresse;
    }


}