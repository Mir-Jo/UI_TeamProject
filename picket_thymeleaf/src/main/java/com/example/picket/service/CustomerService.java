package com.example.picket.service;


import com.example.picket.dto.AddCustomerRequest;
import com.example.picket.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.picket.entity.Customer;

@Slf4j
@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public void save(AddCustomerRequest dto){
        customerRepository.save(Customer.builder()
                .id(dto.getId())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .tel(dto.getTel())
                .email(dto.getEmail())
                .name(dto.getName())
                .birthdate(dto.getBirthdate())
                .point(dto.getPoint())
                .build());
    }
    public boolean authentication(String id, String password) {
        String encodedPassword = customerRepository.findById(id).orElse(null).getPassword();
        log.info("id: "+id);
        log.info(("password: ")+password);
        log.info(("encodedPassword: ")+encodedPassword);
        if(customerRepository.findById(id).orElse(null).getId() != null){
            if(password == null){
                return false;
            }
            if(bCryptPasswordEncoder.matches(password, encodedPassword)){
                return true;
            }
        }
            return false;
    }
}
