package com.example.springtrainingapi.controler;

import com.example.springtrainingapi.model.Employee;
import com.example.springtrainingapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController atteint 2 objectifs :
    Comme @Component, elle permet d’indiquer à Spring que cette classe est un bean.
    Elle indique à Spring d’insérer le retour de la méthode au format JSON dans le corps de la réponse HTTP. Grâce à ce deuxième point, les applications qui vont communiquer avec votre API accéderont au résultat de leur requête en parsant la réponse HTTP.*/

@RestController
public class EmployeeControler {
    @Autowired
    private EmployeeService employeeService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee full filled
     */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }
}
