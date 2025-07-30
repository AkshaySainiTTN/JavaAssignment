package com.jpa2.jpa2.repository;

import com.jpa2.jpa2.Entity.Employee;
import com.jpa2.jpa2.Entity.EmployeeAns4;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("select e.firstName, e.lastName from Employee e where e.salary > (select avg(e2.salary) from Employee e2) order by e.age asc, e.salary desc")
    List<Object[]> getEmployeesWithSalaryGreaterThanAvg();

    @Modifying
    @Query("update Employee e set e.salary = :salary where e.salary < (select avg(e2.salary) from Employee e2)")
    int updateSalaryOfLowEarners(@Param("salary") Double salary);

    @Modifying
    @Query("delete from Employee e where e.salary = (select min(e2.salary) from Employee e2)")
    int deleteEmployeesWithMinSalary();


    @Query(value = "SELECT ID, FIRST_NAME, AGE FROM EMPLOYEE WHERE LAST_NAME LIKE %:suffix", nativeQuery = true
    )
    List<Object[]> getEmployeesWithSufix(@Param("suffix") String suffix);

    @Modifying
    @Query(value = "DELETE FROM EMPLOYEE WHERE AGE > :maxAge", nativeQuery = true
    )
    int deleteByAgeGreaterThan(@Param("maxAge") Integer maxAge);

}




