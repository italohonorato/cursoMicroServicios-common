package cl.teamweichafe.common.dtos;

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
public class MemberMeasureDto {

    private String id;
    private String memberId;
    private String measureId;
    private float value;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDate measureDate;
}
