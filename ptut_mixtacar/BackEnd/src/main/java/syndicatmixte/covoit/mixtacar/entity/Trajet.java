package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Trajet {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_trajet")
    private Integer idTrajet;
    @Basic
    @Column(name = "conducteur")
    private Integer conducteur;
    @Basic
    @Column(name = "nbplace")
    private Integer nbplace;

    public Integer getIdTrajet() {
        return idTrajet;
    }

    public void setIdTrajet(Integer idTrajet) {
        this.idTrajet = idTrajet;
    }

    public Integer getConducteur() {
        return conducteur;
    }

    public void setConducteur(Integer conducteur) {
        this.conducteur = conducteur;
    }

    public Integer getNbplace() {
        return nbplace;
    }

    public void setNbplace(Integer nbplace) {
        this.nbplace = nbplace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trajet trajet = (Trajet) o;

        if (idTrajet != null ? !idTrajet.equals(trajet.idTrajet) : trajet.idTrajet != null) return false;
        if (conducteur != null ? !conducteur.equals(trajet.conducteur) : trajet.conducteur != null) return false;
        if (nbplace != null ? !nbplace.equals(trajet.nbplace) : trajet.nbplace != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTrajet != null ? idTrajet.hashCode() : 0;
        result = 31 * result + (conducteur != null ? conducteur.hashCode() : 0);
        result = 31 * result + (nbplace != null ? nbplace.hashCode() : 0);
        return result;
    }
}
