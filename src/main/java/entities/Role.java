package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @Column(name = "IdRole", nullable = false)
    private Integer id;

    @Size(max = 150)
    @NotNull
    @Column(name = "Denomination", nullable = false, length = 150)
    private String denomination;

    @NotNull
    @Column(name = "Actif", nullable = false)
    private Boolean actif = false;

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

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

}