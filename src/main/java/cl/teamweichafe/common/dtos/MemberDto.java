package cl.teamweichafe.common.dtos;

import cl.teamweichafe.common.configs.LocalDateDeserializer;
import cl.teamweichafe.common.configs.LocalDateSerializer;
import cl.teamweichafe.common.configs.LocalDateTimeDeserializer;
import cl.teamweichafe.common.configs.LocalDateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {

    private String id;
    private String name;
    private String lastName;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dob;
    private Integer phone;
    private String email;
    private String address;
    private String degreeId;
    private String classId;
}
