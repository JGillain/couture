package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "utilisateur_adresse")
public class UtilisateurAdresse {
    @Id
    @Column(name = "IdUtilisateurAdresse", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UtilisateurIdUtilisateur", nullable = false)
    private Utilisateur utilisateurIdUtilisateur;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "AdresseIdAdresse", nullable = false)
    private Adresse adresseIdAdresse;

    @NotNull
    @Column(name = "Actif", nullable = false)
    private Boolean actif = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Utilisateur getUtilisateurIdUtilisateur() {
        return utilisateurIdUtilisateur;
    }

    public void setUtilisateurIdUtilisateur(Utilisateur utilisateurIdUtilisateur) {
        this.utilisateurIdUtilisateur = utilisateurIdUtilisateur;
    }

    public Adresse getAdresseIdAdresse() {
        return adresseIdAdresse;
    }

    public void setAdresseIdAdresse(Adresse adresseIdAdresse) {
        this.adresseIdAdresse = adresseIdAdresse;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

}