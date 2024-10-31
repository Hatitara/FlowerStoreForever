package ua.ucu.edu.apps.lab8_forever.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ucu.edu.apps.lab8_forever.model.AppUser;
import ua.ucu.edu.apps.lab8_forever.repository.AppUserRepository;

import java.util.List;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createAppUser(AppUser appUser) {
        return appUserRepository.save(appUser);
    }

    public AppUser getAppUserByEmail(String email) {
        return appUserRepository.findUserByEmail(email);
    }
}
