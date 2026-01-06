package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {
}
