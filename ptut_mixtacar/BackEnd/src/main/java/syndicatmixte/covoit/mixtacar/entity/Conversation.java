package syndicatmixte.covoit.mixtacar.entity;

import jakarta.persistence.*;

@Entity
public class Conversation {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_conversation", insertable=false, updatable=false)
    private Integer idConversation;
    @ManyToOne
    @JoinColumn(name = "id_conversation", referencedColumnName = "id_messagerie", nullable = false)
    private Messagerie messagerieByIpp;
    @ManyToOne
    @JoinColumn(name = "id_conversation", referencedColumnName = "id_message", nullable = false)
    private Message messageByIpp;
    @Basic
    @Column(name = "id_message")
    private Integer idMessage;

    public Integer getIdConversation() {
        return idConversation;
    }

    public void setIdConversation(Integer idConversation) {
        this.idConversation = idConversation;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conversation that = (Conversation) o;

        if (idConversation != null ? !idConversation.equals(that.idConversation) : that.idConversation != null)
            return false;
        if (idMessage != null ? !idMessage.equals(that.idMessage) : that.idMessage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idConversation != null ? idConversation.hashCode() : 0;
        result = 31 * result + (idMessage != null ? idMessage.hashCode() : 0);
        return result;
    }
}
