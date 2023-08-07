package ru.practicum.shareit.item.comment;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class CommentDto {
    private Long id;
    @NotBlank
    private String text;

    private Long itemId;

    private String authorName;

    private LocalDateTime created;
}
