package ru.rom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rom.entity.RawData;

public interface RawDataDao extends JpaRepository<RawData, Long> {
}
