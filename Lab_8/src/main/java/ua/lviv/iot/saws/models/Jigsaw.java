package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Jigsaw extends Saw{
    private Integer operatingVoltage;

    public Jigsaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Integer operatingVoltage
    ){
        super(MaterialToSaw.WOOD, DriveType.ELECTRIC, sawMaterial, person, lengthInCm);
        this.operatingVoltage = operatingVoltage;
    }
}
