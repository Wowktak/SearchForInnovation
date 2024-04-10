package Accelerator.Controllers;

import Accelerator.Services.CustomerRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class CustomerRecordController {
    @Autowired
    CustomerRecordService customerRecordService;
}
