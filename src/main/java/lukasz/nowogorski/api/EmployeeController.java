package lukasz.nowogorski.api;

import lombok.AllArgsConstructor;
import lukasz.nowogorski.model.Employee;
import lukasz.nowogorski.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeeController {
    
    private final EmployeeRepository repository;

        @GetMapping("/employees")
        public List<Employee> getEmployee()
        {
            return repository.findAll();
        }

        @GetMapping("/employees/{id}")
        public Optional<Employee> getEmployeeById(@PathVariable Long id)
        {
            return repository.findById(id);
        }

        @GetMapping("/employees/{name}/{surname}")
        public Employee getEmployeeByName(@PathVariable String name, @PathVariable String surname)
        {
            return repository.findEmployeeByNameAndSurname(name,surname);
        }

        @PostMapping("/employees")
        public Employee saveEmployee(@RequestBody Employee employee)
        {
            return repository.save(employee);
        }

        @PutMapping("/employees/{id]")
        public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id)
        {
            return repository.updateEmployee(employee,id);
        }

        @DeleteMapping("/employees")
        public void deleteEmployee()
        {
            repository.deleteAll();
        }

        @DeleteMapping("/employees/{id}")
        public void deleteEmployee(@PathVariable Long id)
        {
            repository.deleteById(id);
        }
}
