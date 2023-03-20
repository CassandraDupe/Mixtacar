package syndicatmixte.covoit.mixtacar.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import syndicatmixte.covoit.mixtacar.entity.Preference;

public interface PreferenceRepository extends JpaRepository<Preference, Integer> {
}
