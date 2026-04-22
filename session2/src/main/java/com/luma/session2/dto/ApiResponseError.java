package com.luma.session2.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SecondaryRow;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ApiResponseError {

    @JsonFormat( pattern = "yyyy-MM-dd")
    private LocalDateTime timestamp;
    private int status ;
    private String error ;
    private String message  ;

}
