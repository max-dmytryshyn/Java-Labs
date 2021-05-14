package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MechanicalSaw extends Saw{
    private Double toothSizeInMm;

    public MechanicalSaw(
            MaterialToSaw materialToSaw, SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm
    ){
        super(materialToSaw, DriveType.MECHANICAL, sawMaterial, person, lengthInCm);
        this.toothSizeInMm = toothSizeInMm;
    }

}
