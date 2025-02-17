package ru.skypro.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO комментария
 */
@Data

public class Comment {

    private int author; // id автора комментария
    private String authorImage; // ссылка на аватар автора комментария
    private String authorFirstName; // имя создателя комментария
    private long createdAt; // дата и время создания комментария в миллисекундах с 00:00:00 01.01.1970
    private int pk; // id комментария
    private String text; // текст комментария
}
