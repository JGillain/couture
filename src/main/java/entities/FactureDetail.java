package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "facture_detail")
public class FactureDetail {
    @Id
    @Column(name = "IdFactureDetail", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FactureIdFacture", nullable = false)
    private Facture factureIdFacture;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ExemplaireArticleIdEA", nullable = false)
    private ExemplaireArticle exemplaireArticleIdEA;

    @NotNull
    @Column(name = "DateFin", nullable = false)
    private Date dateFin;

    @Column(name = "DateRetour")
    private Date dateRetour;

    @Size(max = 500)
    @Column(name = "EtatRendu", length = 500)
    private String etatRendu;

    @NotNull
    @Column(name = "Prix", nullable = false)
    private Double prix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Facture getFactureIdFacture() {
        return factureIdFacture;
    }

    public void setFactureIdFacture(Facture factureIdFacture) {
        this.factureIdFacture = factureIdFacture;
    }

    public ExemplaireArticle getExemplaireArticleIdEA() {
        return exemplaireArticleIdEA;
    }

    public void setExemplaireArticleIdEA(ExemplaireArticle exemplaireArticleIdEA) {
        this.exemplaireArticleIdEA = exemplaireArticleIdEA;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(Date dateRetour) {
        this.dateRetour = dateRetour;
    }

    public String getEtatRendu() {
        return etatRendu;
    }

    public void setEtatRendu(String etatRendu) {
        this.etatRendu = etatRendu;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

}