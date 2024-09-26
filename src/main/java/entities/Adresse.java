package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "adresse")
public class Adresse {
    @Id
    @Column(name = "IdAdresse", nullable = false)
    private Integer id;

    @Size(max = 255)
    @NotNull
    @Column(name = "Rue", nullable = false)
    private String rue;

    @Size(max = 4)
    @Column(name = "Boite", length = 4)
    private String boite;

    @Size(max = 6)
    @NotNull
    @Column(name = "Numero", nullable = false, length = 6)
    private String numero;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LocaliteIdLocalite", nullable = false)
    private Localite localiteIdLocalite;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MagasinIdMagasin")
    private Magasin magasinIdMagasin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getBoite() {
        return boite;
    }

    public void setBoite(String boite) {
        this.boite = boite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Localite getLocaliteIdLocalite() {
        return localiteIdLocalite;
    }

    public void setLocaliteIdLocalite(Localite localiteIdLocalite) {
        this.localiteIdLocalite = localiteIdLocalite;
    }

    public Magasin getMagasinIdMagasin() {
        return magasinIdMagasin;
    }

    public void setMagasinIdMagasin(Magasin magasinIdMagasin) {
        this.magasinIdMagasin = magasinIdMagasin;
    }

}