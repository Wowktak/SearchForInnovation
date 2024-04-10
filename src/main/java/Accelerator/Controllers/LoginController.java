package Accelerator.Controllers;

import Accelerator.Services.UserService;
import Accelerator.dto.UserLoginPassw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")

public class LoginController {
    @Autowired
    private UserService userService;
    private UserLoginPassw ulp;

    @PostMapping
    public void getLoginPassword(@RequestBody UserLoginPassw userLoginPassw){
        ulp=userLoginPassw;

    }
    @GetMapping
    public Long returnUser(){
        return userService.findByLoginAndPassword(ulp).getUserId();
    }

}
