package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "IdReservations", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "Actif", nullable = false)
    private Boolean actif;

    @NotNull
    @Column(name = "MailEnvoye", nullable = false)
    private Boolean mailEnvoye = false;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "UtilisateurIdUtilisateur", nullable = false)
    private Utilisateur utilisateurIdUtilisateur;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "MagasinIdMagasin", nullable = false)
    private Magasin magasinIdMagasin;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ArticleIdArticle", nullable = false)
    private Article articleIdArticle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getActif() {
        return actif;
    }

    public void setActif(Boolean actif) {
        this.actif = actif;
    }

    public Boolean getMailEnvoye() {
        return mailEnvoye;
    }

    public void setMailEnvoye(Boolean mailEnvoye) {
        this.mailEnvoye = mailEnvoye;
    }

    public Utilisateur getUtilisateurIdUtilisateur() {
        return utilisateurIdUtilisateur;
    }

    public void setUtilisateurIdUtilisateur(Utilisateur utilisateurIdUtilisateur) {
        this.utilisateurIdUtilisateur = utilisateurIdUtilisateur;
    }

    public Magasin getMagasinIdMagasin() {
        return magasinIdMagasin;
    }

    public void setMagasinIdMagasin(Magasin magasinIdMagasin) {
        this.magasinIdMagasin = magasinIdMagasin;
    }

    public Article getArticleIdArticle() {
        return articleIdArticle;
    }

    public void setArticleIdArticle(Article articleIdArticle) {
        this.articleIdArticle = articleIdArticle;
    }

}