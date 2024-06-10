package br.com.sccon.geospatial.domain.employees.services;

import br.com.sccon.geospatial.domain.employees.entities.Employee;
import br.com.sccon.geospatial.domain.employees.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> listarPeople() {
        Iterable<Employee> people = repository.findAll();
        return (List<Employee>) people;
    }

}
