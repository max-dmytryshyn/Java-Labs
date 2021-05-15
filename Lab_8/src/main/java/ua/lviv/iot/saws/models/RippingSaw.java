package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class RippingSaw extends MechanicalSaw {
    private String toothShape;

    public RippingSaw(
            final SawMaterial sawMaterial, final Person person,
            final Double lengthInCm, final Double toothSizeInMm, final String toothShape
    ) {
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.toothShape = toothShape;
    }
}
