package com.luismerces.workshopmongo.resources;

import com.luismerces.workshopmongo.domain.User;
import com.luismerces.workshopmongo.dto.UserDTO;
import com.luismerces.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
   public ResponseEntity<List<UserDTO>> findAll() {
      List<User> list = userService.findAll();
      List<UserDTO> listdto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
     return ResponseEntity.ok().body(listdto);
   }
}
