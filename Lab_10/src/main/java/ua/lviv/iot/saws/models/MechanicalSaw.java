package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class MechanicalSaw extends Saw {
    private Double toothSizeInMm;

    public MechanicalSaw(
            final MaterialToSaw materialToSaw, final SawMaterial sawMaterial,
            final Person person, final Double lengthInCm, final Double toothSizeInMm
    ) {
        super(materialToSaw, DriveType.MECHANICAL, sawMaterial, person, lengthInCm);
        this.toothSizeInMm = toothSizeInMm;
    }

}
