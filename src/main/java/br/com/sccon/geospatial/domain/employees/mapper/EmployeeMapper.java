package br.com.sccon.geospatial.domain.employees.mapper;

import br.com.sccon.geospatial.controllers.employees.controller.contracts.Response;
import br.com.sccon.geospatial.domain.employees.entities.Employee;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Response> mapEntityToResponse(final List<Employee> people);

}
