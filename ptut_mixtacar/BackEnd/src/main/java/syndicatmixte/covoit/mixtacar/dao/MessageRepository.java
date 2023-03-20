package syndicatmixte.covoit.mixtacar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import syndicatmixte.covoit.mixtacar.entity.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
