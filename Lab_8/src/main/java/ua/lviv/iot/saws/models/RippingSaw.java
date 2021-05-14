package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RippingSaw extends MechanicalSaw{
    private String toothShape;
}
