package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Message {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_message", insertable=false, updatable=false)
    private Integer idMessage;
    @ManyToOne
    @JoinColumn(name = "id_message", referencedColumnName = "id", nullable = false)
    private Utilisateur utilisateurByIpp;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "contenu")
    private String contenu;
    @Basic
    @Column(name = "envoi")
    private Date envoi;
    @Basic
    @Column(name = "recepteur")
    private Integer recepteur;
    @Basic
    @Column(name = "envoyeur")
    private Integer envoyeur;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getEnvoi() {
        return envoi;
    }

    public void setEnvoi(Date envoi) {
        this.envoi = envoi;
    }

    public Integer getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Integer recepteur) {
        this.recepteur = recepteur;
    }

    public Integer getEnvoyeur() {
        return envoyeur;
    }

    public void setEnvoyeur(Integer envoyeur) {
        this.envoyeur = envoyeur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (idMessage != null ? !idMessage.equals(message.idMessage) : message.idMessage != null) return false;
        if (type != null ? !type.equals(message.type) : message.type != null) return false;
        if (contenu != null ? !contenu.equals(message.contenu) : message.contenu != null) return false;
        if (envoi != null ? !envoi.equals(message.envoi) : message.envoi != null) return false;
        if (recepteur != null ? !recepteur.equals(message.recepteur) : message.recepteur != null) return false;
        if (envoyeur != null ? !envoyeur.equals(message.envoyeur) : message.envoyeur != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMessage != null ? idMessage.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (contenu != null ? contenu.hashCode() : 0);
        result = 31 * result + (envoi != null ? envoi.hashCode() : 0);
        result = 31 * result + (recepteur != null ? recepteur.hashCode() : 0);
        result = 31 * result + (envoyeur != null ? envoyeur.hashCode() : 0);
        return result;
    }
}
