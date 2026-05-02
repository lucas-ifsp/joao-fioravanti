package classesEinterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyEmployeesService implements ICompany<Employee, String, String>{
    private final List<Employee> employees;

    public CompanyEmployeesService(){
        this.employees = new ArrayList<>();
    }

    @Override
    public void hire(Employee employee) {
        if(employees.stream()
                .anyMatch(e -> employee.equals(e))) return;
        employees.add(employee);
    }

    @Override
    public void fire(Employee employee) {
        employees.remove(employee);
    }

    @Override
    public Iterator<Employee> getAll() {
        if(employees.isEmpty()) return null;
        return employees.iterator();
    }

    @Override
    public Iterator<Employee> getAllOf(String jobTitle) {
        return employees.stream()
                .filter(e -> e.getJobTitle().equals(jobTitle))
                .toList()
                .iterator();
    }

    @Override
    public void pay(String id) {
        Employee employee =  employees.stream()
                .filter(e -> e.getId().equals(id))
                .findAny()
                .orElse(null);
        if(employee == null) return;
        employee.addPaycheck(LocalDate.now());
    }

    @Override
    public void increaseSalary(String id, Double newSalary) {
        Employee employee = employees.stream()
                .filter(e -> e.getId().equals(id))
                .findAny()
                .orElse(null);
        if(employee == null) return;
        employee.setSalary(newSalary);
    }

    @Override
    public Double averageSalaryOf(String jobtitle) {
        return employees.stream()
                .filter(e -> e.getJobTitle().equals(jobtitle))
                .mapToDouble(e -> e.getSalary())
                .average()
                .orElse(-1);
    }

    //interpretei como data de contratação
    @Override
    public Double averageSalaryBetween(LocalDate initial, LocalDate end) {
        return employees.stream()
                .filter(e ->  e.getDateOfEmployment().isEqual(initial) || e.getDateOfEmployment().isAfter(initial) && e.getDateOfEmployment().isBefore(end))
                .mapToDouble(e -> e.getSalary())
                .average()
                .orElse(-1);
    }
}
