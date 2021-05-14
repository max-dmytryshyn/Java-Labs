package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RippingSaw extends MechanicalSaw{
    private String toothShape;

    @Builder
    public RippingSaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, String toothShape
    ){
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.toothShape = toothShape;
    }
}
