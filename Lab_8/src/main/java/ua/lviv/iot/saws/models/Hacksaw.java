package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hacksaw extends MechanicalSaw{
    String bladeManufacturer;
}
