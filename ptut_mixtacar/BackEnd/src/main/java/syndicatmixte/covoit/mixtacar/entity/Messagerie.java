package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Messagerie {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_messagerie")
    private Integer idMessagerie;
    @Basic
    @Column(name = "id_conversation")
    private Integer idConversation;
    @Basic
    @Column(name = "id_proprio")
    private Integer idProprio;

    public Integer getIdMessagerie() {
        return idMessagerie;
    }

    public void setIdMessagerie(Integer idMessagerie) {
        this.idMessagerie = idMessagerie;
    }

    public Integer getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Integer idConversation) {
        this.idConversation = idConversation;
    }

    public Integer getIdProprio() {
        return idProprio;
    }

    public void setIdProprio(Integer idProprio) {
        this.idProprio = idProprio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Messagerie that = (Messagerie) o;

        if (idMessagerie != null ? !idMessagerie.equals(that.idMessagerie) : that.idMessagerie != null) return false;
        if (idConversation != null ? !idConversation.equals(that.idConversation) : that.idConversation != null)
            return false;
        if (idProprio != null ? !idProprio.equals(that.idProprio) : that.idProprio != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idMessagerie != null ? idMessagerie.hashCode() : 0;
        result = 31 * result + (idConversation != null ? idConversation.hashCode() : 0);
        result = 31 * result + (idProprio != null ? idProprio.hashCode() : 0);
        return result;
    }
}
