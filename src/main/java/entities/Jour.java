package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "jour")
@NamedQueries
        ({
                @NamedQuery(name = "Jours.findAll", query = "SELECT j FROM Jour j"),
                @NamedQuery(name = "Jours.findByNbrJ", query = "SELECT j FROM Jour j WHERE j.nbrJour<=:nbrJour ORDER BY j.nbrJour DESC"),
                @NamedQuery(name = "Jours.findByNbrJExact", query = "SELECT j FROM Jour j WHERE j.nbrJour=:nbrJour"),
        })
public class Jour {
    @Id
    @Column(name = "IdJour", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "NbrJour", nullable = false)
    private Integer nbrJour;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNbrJour() {
        return nbrJour;
    }

    public void setNbrJour(Integer nbrJour) {
        this.nbrJour = nbrJour;
    }

}