package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @Column(name = "IdArticle", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "Nom", nullable = false)
    private String nom;

    @NotNull
    @Column(name = "Actif", nullable = false)
    private Boolean actif = false;

    @NotNull
    @Column(name = "Prix", nullable = false)
    private Double prix;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FabricantIdFabricant", nullable = false)
    private Fabricant fabricantIdFabricant;

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

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Fabricant getFabricantIdFabricant() {
        return fabricantIdFabricant;
    }

    public void setFabricantIdFabricant(Fabricant fabricantIdFabricant) {
        this.fabricantIdFabricant = fabricantIdFabricant;
    }

}