package Accelerator.Controllers;

import Accelerator.DBEntity.DBUser;
import Accelerator.Services.UserService;
import Accelerator.annotate.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/profile")

public class ProfileController {

    @Autowired
    private UserService userService;

    @GetMapping()
    public DBUser profile(@CurrentUser DBUser dbUser) {
        return dbUser;
    }
    @PutMapping
    public void update(@RequestBody DBUser dbUser){
        userService.update(dbUser);
    }
}

