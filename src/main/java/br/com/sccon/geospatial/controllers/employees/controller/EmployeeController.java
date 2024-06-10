package br.com.sccon.geospatial.controllers.employees.controller;

import br.com.sccon.geospatial.controllers.employees.controller.contracts.Request;
import br.com.sccon.geospatial.controllers.employees.controller.contracts.Response;
import br.com.sccon.geospatial.domain.employees.entities.Employee;
import br.com.sccon.geospatial.domain.employees.mapper.EmployeeMapper;
import br.com.sccon.geospatial.domain.employees.services.EmployeeService;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    @PostMapping
    void add(@RequestBody Request request) {

    }

    @GetMapping
    public ResponseEntity<List<Response>> read() {

        List<Employee> people = service.listarPeople();
        List<Response> response = Mappers.getMapper(EmployeeMapper.class).mapEntityToResponse(people);

        if (response == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PutMapping("/{peopleId}")
    public void update(@RequestBody Response response, @PathVariable Integer peopleId) {

    }


    @DeleteMapping("/{peopleId}")
    public void delete() {

    }


}
