package com.example.datefinder;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.*;
import java.time.format.*;

@RestController
public class MyController {
    
    @GetMapping("/")
    public String getDate(){
        LocalDateTime date=LocalDateTime.now();
        LocalDateTime newDate=date.plusDays(100);
        DateTimeFormatter formaattedDate=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newD=newDate.format(formaattedDate);
        return newD;
    }

}
