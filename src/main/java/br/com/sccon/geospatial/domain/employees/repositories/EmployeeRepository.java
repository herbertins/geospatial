package br.com.sccon.geospatial.domain.employees.repositories;

import br.com.sccon.geospatial.domain.employees.entities.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
