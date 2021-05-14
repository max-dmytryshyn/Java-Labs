package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class RippingSaw extends MechanicalSaw{
    private String toothShape;

    public RippingSaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, String toothShape
    ){
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.toothShape = toothShape;
    }
}
