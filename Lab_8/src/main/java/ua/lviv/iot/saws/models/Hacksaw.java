package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Hacksaw extends MechanicalSaw{
    String bladeManufacturer;

    @Builder
    public Hacksaw(
            MaterialToSaw materialToSaw, DriveType driveType, SawMaterial sawMaterial, Person person,
            Double lengthInCm, Double toothSizeInMm, String bladeManufacturer
    ){
        super(materialToSaw, driveType, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.bladeManufacturer = bladeManufacturer;
    }
}
