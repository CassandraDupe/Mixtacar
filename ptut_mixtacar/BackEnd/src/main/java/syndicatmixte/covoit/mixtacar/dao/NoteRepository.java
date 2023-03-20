package syndicatmixte.covoit.mixtacar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import syndicatmixte.covoit.mixtacar.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
