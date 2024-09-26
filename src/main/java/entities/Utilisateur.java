package entities;

import enumeration.UtilisateurSexeEnum;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id
    @Column(name = "IdUtilisateur", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "Nom", nullable = false, length = 150)
    private String nom;

    @Size(max = 150)
    @NotNull
    @Column(name = "Prenom", nullable = false, length = 150)
    private String prenom;

    @NotNull
    @Lob
    @Column(name = "Sexe", nullable = false)
    private UtilisateurSexeEnum sexe;

    @Size(max = 255)
    @Column(name = "Courriel")
    private String courriel;

    @Size(max = 255)
    @Column(name = "Login")
    private String login;

    @Size(max = 255)
    @Column(name = "Mdp")
    private String mdp;

    @NotNull
    @Column(name = "Actif", nullable = false)
    private Boolean actif = false;

    @Size(max = 10)
    @Column(name = "NumMembre", length = 10)
    private String numMembre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public UtilisateurSexeEnum getSexe() {
        return sexe;
    }

    public void setSexe(UtilisateurSexeEnum sexe) {
        this.sexe = sexe;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public String getNumMembre() {
        return numMembre;
    }

    public void setNumMembre(String numMembre) {
        this.numMembre = numMembre;
    }

}