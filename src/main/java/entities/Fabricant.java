package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fabricant")
public class Fabricant {
    @Id
    @Column(name = "IdFabricant", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "Nom", nullable = false)
    private String nom;

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

}