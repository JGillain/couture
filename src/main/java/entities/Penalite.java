package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "penalite")
public class Penalite {
    @Id
    @Column(name = "IdPenalites", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "Denomination", nullable = false, length = 150)
    private String denomination;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

}