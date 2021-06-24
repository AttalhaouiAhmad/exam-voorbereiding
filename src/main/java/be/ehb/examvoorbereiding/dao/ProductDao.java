package be.ehb.examvoorbereiding.dao;

import be.ehb.examvoorbereiding.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product,Integer> {
}
