package ru.practicum.shareit.booking.dto;

import lombok.*;
import ru.practicum.shareit.booking.Status;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class BookingDto {
    private Long id;

    private LocalDateTime start;

    private LocalDateTime end;
    private Status status;

    private UserDt0 booker;

    private ItemDto item;

    @Data
    public static class UserDt0 {
        private final long id;
        private final String name;
    }

    @Data
    public static class ItemDto {
        private final long id;
        private final String name;
    }
}
