package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Arret {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_arret")
    private Integer idArret;
    @Basic
    @Column(name = "nom")
    private String nom;
    @Basic
    @Column(name = "lat")
    private Double lat;
    @Basic
    @Column(name = "lon")
    private Double lon;

    public Integer getIdArret() {
        return idArret;
    }

    public void setIdArret(Integer idArret) {
        this.idArret = idArret;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arret arret = (Arret) o;

        if (idArret != null ? !idArret.equals(arret.idArret) : arret.idArret != null) return false;
        if (nom != null ? !nom.equals(arret.nom) : arret.nom != null) return false;
        if (lat != null ? !lat.equals(arret.lat) : arret.lat != null) return false;
        if (lon != null ? !lon.equals(arret.lon) : arret.lon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idArret != null ? idArret.hashCode() : 0;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (lat != null ? lat.hashCode() : 0);
        result = 31 * result + (lon != null ? lon.hashCode() : 0);
        return result;
    }
}
