package ru.rom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rom.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}
