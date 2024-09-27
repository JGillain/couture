package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "localite")
public class Localite {
    @Id
    @Column(name = "IdLocalite", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "CP", nullable = false)
    private Integer cp;

    @Size(max = 255)
    @NotNull
    @Column(name = "Ville", nullable = false)
    private String ville;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PaysIdPays", nullable = false)
    private Pays paysIdPays;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Pays getPaysIdPays() {
        return paysIdPays;
    }

    public void setPaysIdPays(Pays paysIdPays) {
        this.paysIdPays = paysIdPays;
    }

}