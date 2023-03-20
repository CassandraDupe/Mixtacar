package syndicatmixte.covoit.mixtacar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import syndicatmixte.covoit.mixtacar.entity.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation, Integer> {
}
