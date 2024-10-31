package ua.ucu.edu.apps.lab8_forever.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ucu.edu.apps.lab8_forever.model.AppUser;
import ua.ucu.edu.apps.lab8_forever.service.AppUserService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppUserController {

    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/user")
    public List<AppUser> getAllUsers() {
        return appUserService.getUsers();
    }

    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser appUser) {
        return appUserService.createAppUser(appUser);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = appUserService.getAppUserByEmail(email);
        if (userByEmail == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userByEmail);
    }
}
