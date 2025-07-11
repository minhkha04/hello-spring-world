package com.emkay.sb.service;

import com.emkay.sb.infra.ExcelGenerator;
import com.emkay.sb.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    @Autowired // Reflection technique
    private final UserRepository userRepository;
    private final ExcelGenerator excelGenerator;

    public UserService(UserRepository userRepository, ExcelGenerator excelGenerator) {
        this.excelGenerator = excelGenerator;
        this.userRepository = userRepository;
    }

    public void save() {
        excelGenerator.generateExcel("test.xlsx");
        userRepository.save();
    }
}
