package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Fretsaw {
    private Double arcLengthInCm;
    private String bladeManufacturer;
}
