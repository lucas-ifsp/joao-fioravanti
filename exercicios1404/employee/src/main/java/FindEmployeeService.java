public class FindEmployeeService {
    private Repository<Employee, String> repository;

    public FindEmployeeService(Repository<Employee, String> repository){
        this.repository = repository;
    }

    public Employee findById(String id){
        if(id == null || id.isBlank()) return null;
        return repository.findById(id);
    }
}
