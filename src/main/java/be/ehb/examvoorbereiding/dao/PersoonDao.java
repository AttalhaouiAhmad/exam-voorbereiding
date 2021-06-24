package be.ehb.examvoorbereiding.dao;

import be.ehb.examvoorbereiding.entities.Persoon;
import org.springframework.data.repository.CrudRepository;

public interface PersoonDao extends CrudRepository<Persoon,Integer> {
}
