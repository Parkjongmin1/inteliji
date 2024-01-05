package com.jvision.admin.web.dto;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트()
    {
        String name = "Park Jongmin";
        int amount = 1000;
        String address = "konyang";

        HelloResponseDto dto = new HelloResponseDto(name, amount,address);
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getAddress()).isEqualTo(address);
    }
}
