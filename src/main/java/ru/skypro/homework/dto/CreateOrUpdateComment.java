package ru.skypro.homework.dto;

import lombok.Data;

/**
 * DTO создания комментария.
 */
@Data
public class CreateOrUpdateComment {

    private String text; // текст комментария
}
