package pl.akademiakodu.clinic.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.clinic.Doctor;

public interface DoctorDao extends CrudRepository<Doctor, Integer> {
}
