package Accelerator.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Accelerator.DBEntity.Role;
import Accelerator.Repository.RoleRepository;

import java.util.List;

@Service

public class RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
        public RoleService(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }
    public List<Role> getAllAccType(){
        System.out.println(roleRepository.findAll());
        return roleRepository.findAll();
    }
}
