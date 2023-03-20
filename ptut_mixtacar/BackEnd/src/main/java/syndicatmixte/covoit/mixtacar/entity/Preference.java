package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Preference {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "identif")
    private Integer identif;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "etat")
    private Boolean etat;

    public Integer getIdentif() {
        return identif;
    }

    public void setIdentif(Integer identif) {
        this.identif = identif;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Boolean getEtat() {
        return etat;
    }

    public void setEtat(Boolean etat) {
        this.etat = etat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Preference that = (Preference) o;

        if (identif != null ? !identif.equals(that.identif) : that.identif != null) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (etat != null ? !etat.equals(that.etat) : that.etat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = identif != null ? identif.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (etat != null ? etat.hashCode() : 0);
        return result;
    }
}
