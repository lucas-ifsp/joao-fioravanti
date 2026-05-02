package classesEinterface;

import java.time.LocalDate;
import java.util.Iterator;

public class Company{
    private String name;
    private final ICompany<Employee, String, String> ICompany;

    public Company(String name, ICompany<Employee, String, String> ICompany) {
        this.name = name;
        this.ICompany = ICompany;
    }

    public void hire(Employee employee){
        if(employee == null) return;
        ICompany.hire(employee);
    }

    public void fire(Employee employee){
        if(employee == null) return;
        ICompany.fire(employee);
    }

    public Iterator<Employee> getEmployees(){
        return ICompany.getAll();
    }

    public Iterator<Employee> getEmployees(String jobTitle){
        if(jobTitle == null || jobTitle.isBlank()) return null;
        return ICompany.getAllOf(jobTitle);
    }

    public void pay(String id){
        if(id == null || id.isBlank()) return;
        ICompany.pay(id);
    }

    public void increaeSalary(String id, double newSalary){
        if(id == null || id.isBlank()) return;
        if(newSalary <= 0) return;
        ICompany.increaseSalary(id, newSalary);
    }

    public double averageSalary(String jobTitle){
        if(jobTitle == null || jobTitle.isBlank()) return -1;
        return ICompany.averageSalaryOf(jobTitle);
    }

    public double averageSalary(LocalDate initial, LocalDate end){
        if(!(initial.isBefore(end))) return -1;
        return ICompany.averageSalaryBetween(initial, end);
    }

    public ICompany<Employee, String, String> getCompanyService() {
        return ICompany;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) return;
        this.name = name;
    }
}
