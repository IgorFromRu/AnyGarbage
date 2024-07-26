package ru.rom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rom.entity.AppUser;


public interface AppUserDAO extends JpaRepository<ru.rom.entity.AppUser, Long> {
    AppUser findAppUserByTelegramUserId(Long id);
}
