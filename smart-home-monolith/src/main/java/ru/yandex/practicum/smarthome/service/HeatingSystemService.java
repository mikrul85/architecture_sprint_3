package ru.yandex.practicum.smarthome.service;

import ru.yandex.practicum.smarthome.dto.HeatingSystemDto;
import ru.yandex.practicum.smarthome.entity.HeatingSystem;

public interface HeatingSystemService {
    /// Получить состояние системы
    HeatingSystemDto getHeatingSystem(Long id);
    /// Обновить состояние системы
    HeatingSystemDto updateHeatingSystem(Long id, HeatingSystemDto heatingSystemDto);
    /// Включить отопление
    void turnOn(Long id);
    /// Выключить отопление
    void turnOff(Long id);
    /// Установить температуру
    void setTargetTemperature(Long id, double temperature);
    /// Получить температуру
    Double getCurrentTemperature(Long id);
}