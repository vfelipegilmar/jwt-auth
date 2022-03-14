package com.app.stein.api;

import com.app.stein.model.Role;
import com.app.stein.model.Teste;
import com.app.stein.model.Teste2;
import com.app.stein.model.User;
import com.app.stein.service.Teste2Service;
import com.app.stein.service.TesteService;
import com.app.stein.service.UserService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserResource {
    private final UserService userService;
    private final TesteService testeService;

    private final Teste2Service teste2Service;

    @GetMapping("/users")
    public ResponseEntity<List<User>>getUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @PostMapping("/user/save")
    public ResponseEntity<User>saveUser(@RequestBody User user) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/user/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveUser(user));
    }

    @PostMapping("/role/save")
    public ResponseEntity<Role>saveRole(@RequestBody Role role) {
        URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/role/save").toUriString());
        return ResponseEntity.created(uri).body(userService.saveRole(role));
    }

    @PostMapping("/role/addtouser")
    public ResponseEntity<Role>addRoleToUser(@RequestBody RoleToUserForm form) {
        userService.addRoleToUser(form.getUsername(), form.getRoleName());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/teste")
    public ResponseEntity<List<Teste>>getTeste(){
        return ResponseEntity.ok().body(testeService.findAll());
    }


    @GetMapping("/teste2")
    public ResponseEntity<List<Teste2>>getTeste2(){
        return ResponseEntity.ok().body(teste2Service.findAll());
    }
}

@Data
class RoleToUserForm {
    private String username;
    private String roleName;
}
