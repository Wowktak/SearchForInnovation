package Accelerator.Controllers;

import Accelerator.DBEntity.DBUser;
import Accelerator.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registration")

public class RegistrationController {
    @Autowired
    private UserService userService;

    @PostMapping
    public void registrate(@RequestBody DBUser dbUser){
        userService.create(dbUser);
    }

}
