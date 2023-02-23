package org.example.Seminar3.cw3.Zadanie2;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

    @Data
    @AllArgsConstructor
    public class Student {
        private String fio;
        private Integer group;
        private Integer money;
        List<Integer> count;


}
