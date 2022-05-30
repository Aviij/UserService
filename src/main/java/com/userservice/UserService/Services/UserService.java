package com.userservice.UserService.Services;


import com.userservice.UserService.Repositories.UserRepository;
import com.userservice.UserService.dtos.OrderDTO;
import com.userservice.UserService.dtos.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserService {


    private final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    @Value("${order-service.base-url}")
    private String orderServiceBaseUrl;

    @Value("${order-service.order-url}")
    private String orderServiceOrderUrl;

    @Autowired
    private RestTemplateBuilder restTemplate;

  /* @Autowired
    private UserRepository repository;
*/



    // Get all data from the data base through repository

    public List<UserDTO> getAllUsers(){
        LOGGER.info("//Enter into getUserService in UserService" );

        return Arrays.asList(

                new UserDTO("1","Sathii","24"),
                new UserDTO("2","Aviii","24"),
                new UserDTO("3","Aira","54"),
                new UserDTO("4","Rukmanii","54")

                );




     /*   List<UserDTO> users = null;
        try {
            users = repository.findAll()
                    .stream()
                    .map(userEntity -> new UserDTO(
                            userEntity.getId(),
                            userEntity.getName(),
                            userEntity.getAge()
                    )).collect(Collectors.toList());
        }
        catch (Exception e){System.out.println("Execption in user Service -> getAllUsers ");}

        return users;
*/
    }

    //get data from order service

    public  List<OrderDTO> getOrdersByUserId(String id){
        List<OrderDTO> orders = null;
        try{
     orders = restTemplate.build().getForObject(orderServiceBaseUrl.concat(orderServiceOrderUrl).concat("/"+id),
                List.class);

        }catch (Exception e){ LOGGER.warn("???????????? Execption in userservice -> getOrdersByUserId()" + e); }

        return  orders;
    }



}
