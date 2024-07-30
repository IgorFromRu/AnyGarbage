package ru.rom.service;

import org.telegram.telegrambots.meta.api.objects.Message;
import ru.rom.entity.AppDocument;

public interface FileService {
    AppDocument processDoc(Message externalMessage);
}
