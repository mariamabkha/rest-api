package ge.ibsu.demo.services;

import ge.ibsu.demo.entities.Department;
import ge.ibsu.demo.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;


    public List<Department> getAll(){
        return departmentRepository.findAll();
    }

    public Department getById(long id) throws Exception {
        return departmentRepository.findById(id).orElseThrow(() -> new Exception("RECORD_NOT_FOUND"));
    }


}
