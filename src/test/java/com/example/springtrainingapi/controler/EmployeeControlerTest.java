package com.example.springtrainingapi.controler;

import com.example.springtrainingapi.service.EmployeeService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


//@AutoConfigureMockMvc
//@SpringBootTest
@WebMvcTest(controllers = EmployeeControler.class)  //Fonctionne avec cette anotation ou les deux commenté plus haut, @WebMvcTest(controllers = EmployeeController.class) déclenche le mécanisme permettant de tester les controllers. On indique également le ou les controllers concernés.
class EmployeeControlerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean //L’attribut employeeService est annoté @MockBean. Il est obligatoire, car la méthode du controller exécutée par l’appel de “/employees” utilise cette classe.
    private EmployeeService employeeService;

    @Test
    void createEmployee() {
    }

    @Test
    void getEmployee() {
    }

    @Test
    void getEmployees() throws Exception {
        mockMvc.perform(get("/employees")).andExpect(status().isOk());    //L’attribut mockMvc est un autre élément important. Il permet d’appeler la méthode “perform” qui déclenche la requête.
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void deleteEmployee() {
    }
}