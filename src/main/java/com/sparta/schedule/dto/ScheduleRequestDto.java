package com.sparta.schedule.dto;

import jakarta.persistence.Column;
import lombok.Getter;

@Getter
public class ScheduleRequestDto {
    private String title;
    private String contents;
    private String username;
}
