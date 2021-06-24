package be.ehb.examvoorbereiding.dao;

import be.ehb.examvoorbereiding.entities.Bod;
import be.ehb.examvoorbereiding.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface BodDao extends CrudRepository<Bod,Integer> {

    Iterable<Bod> findAllByProductId(Product id);
}
