package pl.akademiakodu.clinic.dao;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.clinic.Patient;

public interface PatientDao extends CrudRepository<Patient, Integer>  {


}
