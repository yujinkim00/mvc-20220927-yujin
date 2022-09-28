package com.study.mvc20220927yujin.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
/*↑↑↑ 밑에 4개 포함
@EqualsAndHashCode
@Setter
@Getter
@ToString */

public class TestReqDto {
    private String strData;
    private String name;
    private int number;
}
