public class RegisterEmployeeService {
    private final Repository<Employee, String> repository;

    public RegisterEmployeeService(Repository<Employee, String> repository){
        this.repository = repository;
    }

    public boolean register(Employee employee){
        if(employee == null) return false;
        return repository.register(employee);
    }
}
