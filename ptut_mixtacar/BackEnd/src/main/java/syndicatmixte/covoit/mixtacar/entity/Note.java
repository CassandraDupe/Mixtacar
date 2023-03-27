package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Note {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_note", insertable=false, updatable=false)
    private Integer idNote;
    @Basic
    @Column(name = "valeur")
    private Integer valeur;
    @Basic
    @Column(name = "notant")
    private Integer notant;
    @Basic
    @Column(name = "notee")
    private Integer notee;
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    private Utilisateur utilisateurByIpp;

    public Integer getIdNote() {
        return idNote;
    }

    public void setIdNote(Integer idNote) {
        this.idNote = idNote;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Integer getNotant() {
        return notant;
    }

    public void setNotant(Integer notant) {
        this.notant = notant;
    }

    public Integer getNotee() {
        return notee;
    }

    public void setNotee(Integer notee) {
        this.notee = notee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Note note = (Note) o;

        if (idNote != null ? !idNote.equals(note.idNote) : note.idNote != null) return false;
        if (valeur != null ? !valeur.equals(note.valeur) : note.valeur != null) return false;
        if (notant != null ? !notant.equals(note.notant) : note.notant != null) return false;
        if (notee != null ? !notee.equals(note.notee) : note.notee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idNote != null ? idNote.hashCode() : 0;
        result = 31 * result + (valeur != null ? valeur.hashCode() : 0);
        result = 31 * result + (notant != null ? notant.hashCode() : 0);
        result = 31 * result + (notee != null ? notee.hashCode() : 0);
        return result;
    }
}
