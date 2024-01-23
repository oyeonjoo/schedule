package com.sparta.schedule.dto;

import com.sparta.schedule.entity.Schedule;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ScheduleResponseDto {
    private String title;
    private String contents;
    private String username;
    private LocalDateTime date;

    public ScheduleResponseDto(Schedule schedule) {
        this.title = schedule.getTitle();
        this.contents = schedule.getContents();
        this.username = schedule.getUsername();
        this.date = LocalDateTime.now();
    }
}
