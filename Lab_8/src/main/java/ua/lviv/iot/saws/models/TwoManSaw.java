package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TwoManSaw extends MechanicalSaw{
    private Person secondUser;
}
