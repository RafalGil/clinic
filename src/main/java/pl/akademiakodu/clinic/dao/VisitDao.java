package pl.akademiakodu.clinic.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.clinic.Visit;

public interface VisitDao extends CrudRepository <Visit, Integer> {
}
