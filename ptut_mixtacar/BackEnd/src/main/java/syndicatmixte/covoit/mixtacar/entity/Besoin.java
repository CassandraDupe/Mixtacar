package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Besoin {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_besoin")
    private Integer idBesoin;
    @Basic
    @Column(name = "urgent")
    private Boolean urgent;
    @Basic
    @Column(name = "conducteur")
    private Boolean conducteur;
    @Basic
    @Column(name = "nbre_demandes")
    private Integer nbreDemandes;
    @Basic
    @Column(name = "id_util")
    private Integer idUtil;

    public Integer getIdBesoin() {
        return idBesoin;
    }

    public void setIdBesoin(Integer idBesoin) {
        this.idBesoin = idBesoin;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getConducteur() {
        return conducteur;
    }

    public void setConducteur(Boolean conducteur) {
        this.conducteur = conducteur;
    }

    public Integer getNbreDemandes() {
        return nbreDemandes;
    }

    public void setNbreDemandes(Integer nbreDemandes) {
        this.nbreDemandes = nbreDemandes;
    }

    public Integer getIdUtil() {
        return idUtil;
    }

    public void setIdUtil(Integer idUtil) {
        this.idUtil = idUtil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Besoin besoin = (Besoin) o;

        if (idBesoin != null ? !idBesoin.equals(besoin.idBesoin) : besoin.idBesoin != null) return false;
        if (urgent != null ? !urgent.equals(besoin.urgent) : besoin.urgent != null) return false;
        if (conducteur != null ? !conducteur.equals(besoin.conducteur) : besoin.conducteur != null) return false;
        if (nbreDemandes != null ? !nbreDemandes.equals(besoin.nbreDemandes) : besoin.nbreDemandes != null)
            return false;
        if (idUtil != null ? !idUtil.equals(besoin.idUtil) : besoin.idUtil != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBesoin != null ? idBesoin.hashCode() : 0;
        result = 31 * result + (urgent != null ? urgent.hashCode() : 0);
        result = 31 * result + (conducteur != null ? conducteur.hashCode() : 0);
        result = 31 * result + (nbreDemandes != null ? nbreDemandes.hashCode() : 0);
        result = 31 * result + (idUtil != null ? idUtil.hashCode() : 0);
        return result;
    }
}
