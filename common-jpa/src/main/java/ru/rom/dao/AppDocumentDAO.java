package ru.rom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rom.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}
