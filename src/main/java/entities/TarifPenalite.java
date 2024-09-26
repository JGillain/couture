package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "tarif_penalite")
public class TarifPenalite {
    @Id
    @Column(name = "IdTarifPenalite", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "TarifIdTarif", nullable = false)
    private Tarif tarifIdTarif;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PenaliteIdPenalite", nullable = false)
    private Penalite penaliteIdPenalite;

    @NotNull
    @Column(name = "Prix", nullable = false)
    private Double prix;

    @NotNull
    @Column(name = "DateDebut", nullable = false)
    private Date dateDebut;

    @NotNull
    @Column(name = "DateFin", nullable = false)
    private Date dateFin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tarif getTarifIdTarif() {
        return tarifIdTarif;
    }

    public void setTarifIdTarif(Tarif tarifIdTarif) {
        this.tarifIdTarif = tarifIdTarif;
    }

    public Penalite getPenaliteIdPenalite() {
        return penaliteIdPenalite;
    }

    public void setPenaliteIdPenalite(Penalite penaliteIdPenalite) {
        this.penaliteIdPenalite = penaliteIdPenalite;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

}