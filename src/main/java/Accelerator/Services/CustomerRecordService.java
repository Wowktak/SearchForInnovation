package Accelerator.Services;

import Accelerator.Repository.CustomerRecordRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerRecordService {
    @Autowired
    private CustomerRecordRepository customerRecordRepository;


}
