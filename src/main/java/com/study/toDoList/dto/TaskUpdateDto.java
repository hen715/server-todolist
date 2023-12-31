package com.study.toDoList.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class TaskUpdateDto {
    @NotBlank
    private String title;
    @NotNull
    private String description;
    @FutureOrPresent
    private LocalDate endDate;

    @Builder
    public TaskUpdateDto(String title, String description, LocalDate endDate){
        this.title =title;
        this.description = description;
        this.endDate = endDate;
    }
}
