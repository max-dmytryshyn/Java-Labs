package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Jigsaw extends Saw{
    private Integer operatingVoltage;

    @Builder
    public Jigsaw(
            MaterialToSaw materialToSaw, DriveType driveType, SawMaterial sawMaterial, Person person,
            Double lengthInCm, Integer operatingVoltage
    ){
        super(materialToSaw, driveType, sawMaterial, person, lengthInCm);
        this.operatingVoltage = operatingVoltage;
        this.driveType = DriveType.ELECTRIC;
    }
}
