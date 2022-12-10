package com.example.springtrainingapi.service;

import com.example.springtrainingapi.model.Employee;
import com.example.springtrainingapi.repository.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class EmployeeService {  //Un petit zoom sur l’annotation @Service : tout comme l’annotation @Repository, c’est une spécialisation de @Component. Son rôle est donc le même, mais son nom a une valeur sémantique pour ceux qui lisent votre code

    @Autowired  //variable cree automatiquement par Spring a l'instanciation de notre EmployeeRepository
    private EmployeeRepository employeeRepository;


    public Optional<Employee> getEmployee(final Long id) {
        return employeeRepository.findById(id);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void deleteEmployee(final Long id) {
        employeeRepository.deleteById(id);
    }

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
