package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Chainsaw extends Saw{
    private Double tankVolume;

    @Builder
    public Chainsaw(
            MaterialToSaw materialToSaw, DriveType driveType, SawMaterial sawMaterial, Person person,
            Double lengthInCm, Double tankVolume
    ){
        super(materialToSaw, driveType, sawMaterial, person, lengthInCm);
        this.tankVolume = tankVolume;
        this.driveType = DriveType.INTERNAL_COMBUSTION_ENGINE;
    }
}
