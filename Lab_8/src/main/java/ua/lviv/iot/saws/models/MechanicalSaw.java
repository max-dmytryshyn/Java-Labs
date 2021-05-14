package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class MechanicalSaw extends Saw{
    private Double toothSizeInMm;

    public MechanicalSaw(
            MaterialToSaw materialToSaw, SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm
    ){
        super(materialToSaw, DriveType.MECHANICAL, sawMaterial, person, lengthInCm);
        this.toothSizeInMm = toothSizeInMm;
    }

}
