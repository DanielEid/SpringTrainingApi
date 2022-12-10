package com.example.springtrainingapi.repository;

import com.example.springtrainingapi.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
/*
 * Le composant Spring Data JPA ! permet d’exécuter des requêtes SQL, sans avoir besoin de les écrire dans une interface.
 */

@Repository // @Repository est une annotation Spring pour indiquer que la classe est un bean, et que son rôle est de communiquer avec une source de données (en l'occurrence la base de données).
public interface EmployeeRepository extends CrudRepository<Employee,Long> { //CrudRepository est une interface fournie par Spring. Elle fournit des méthodes pour manipuler votre entité. Elle utilise la généricité pour que son code soit applicable à n’importe quelle entité, d’où la syntaxe “CrudRepository<Employee, Long>”
}

/**
 *OBJECTIF DE CHAQUE COUCHE
 * Controller: Réceptionner la requête et fournir la réponse
 * Service: Exécuter les traitements métiers
 * Repository: Communiquer avec la source de données
 * Model: Contenir les objects métiers
 * */