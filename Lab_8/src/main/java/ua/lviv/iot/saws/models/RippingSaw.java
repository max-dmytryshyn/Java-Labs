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
            final Integer id, final SawMaterial sawMaterial, final Integer userId,
            final Double lengthInCm, final Double toothSizeInMm, final String toothShape
    ) {
        super(id, MaterialToSaw.WOOD, sawMaterial, userId, lengthInCm, toothSizeInMm);
        this.toothShape = toothShape;
    }
}
