package ge.ibsu.demo.controllers;

import ge.ibsu.demo.entities.Department;
import ge.ibsu.demo.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/all" , method = RequestMethod.GET, produces = {"application/json"})
    public List<Department> getAll(){
        return  departmentService.getAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = {"application/json"})
    public Department getById(@PathVariable long id) throws Exception {
        return departmentService.getById(id);
    }
}
