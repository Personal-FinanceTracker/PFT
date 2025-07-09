package com.alibou.fileupload.student;

import java.time.LocalDate;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentCsvRepresentation {

    @CsvBindByName(column = "date")
    @CsvDate("yyyy-MM-dd")
    private LocalDate date;
    @CsvBindByName(column = "amount")
    private Double amount;
    @CsvBindByName(column = "category")
    private String category;
    @CsvBindByName(column = "status")
    private String status;
}
