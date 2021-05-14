package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MechanicalSaw extends Saw{
    private Double toothSizeInMm;

    @Builder
    public MechanicalSaw(
            MaterialToSaw materialToSaw, DriveType driveType, SawMaterial sawMaterial, Person person,
            Double lengthInCm, Double toothSizeInMm
    ){
        super(materialToSaw, driveType, sawMaterial, person, lengthInCm);
        this.toothSizeInMm = toothSizeInMm;
        this.driveType = DriveType.MECHANICAL;
    }

}
