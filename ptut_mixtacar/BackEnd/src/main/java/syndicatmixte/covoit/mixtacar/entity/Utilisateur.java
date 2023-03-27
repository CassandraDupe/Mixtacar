package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

import java.util.Collection;


@Entity
public class Utilisateur {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", insertable=false, updatable=false)
    private Integer id;

    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "prenom")
    private String prenom;
    @Basic
    @Column(name = "adresse_mail")
    private String adresseMail;
    @Basic
    @Column(name = "mdp")
    private String mdp;
    @Basic
    @Column(name = "descript")
    private String descript;
    @Basic
    @Column(name = "preferences")
    private Integer preferences;
    @OneToMany(mappedBy = "utilisateurByIdnote")
    private Collection<Note>  noteByIdutilisateur;
    @OneToMany(mappedBy ="utilisateursByIdpreference")
    private Collection<Preference> preferenceByIdutilisateur;
    @OneToMany(mappedBy ="utilisateursByIdtrajet")
    private Collection<Trajet> trajetByIdutilisateur;
    @OneToMany(mappedBy ="utilisateursByIdbesoin")
    private Collection<Besoin> besoinByIdutilisateur;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public Integer getPreferences() {
        return preferences;
    }

    public void setPreferences(Integer preferences) {
        this.preferences = preferences;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Utilisateur that = (Utilisateur) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (prenom != null ? !prenom.equals(that.prenom) : that.prenom != null) return false;
        if (adresseMail != null ? !adresseMail.equals(that.adresseMail) : that.adresseMail != null) return false;
        if (mdp != null ? !mdp.equals(that.mdp) : that.mdp != null) return false;
        if (descript != null ? !descript.equals(that.descript) : that.descript != null) return false;
        if (preferences != null ? !preferences.equals(that.preferences) : that.preferences != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (adresseMail != null ? adresseMail.hashCode() : 0);
        result = 31 * result + (mdp != null ? mdp.hashCode() : 0);
        result = 31 * result + (descript != null ? descript.hashCode() : 0);
        result = 31 * result + (preferences != null ? preferences.hashCode() : 0);
        return result;
    }
}
