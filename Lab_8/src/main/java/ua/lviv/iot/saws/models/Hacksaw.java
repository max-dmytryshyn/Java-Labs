package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Hacksaw extends MechanicalSaw {
    String bladeManufacturer;

    public Hacksaw(
            final Integer id, final SawMaterial sawMaterial, final Integer userId, final Double lengthInCm,
            final Double toothSizeInMm, final String bladeManufacturer
    ) {
        super(id, MaterialToSaw.METAL, sawMaterial, userId, lengthInCm, toothSizeInMm);
        this.bladeManufacturer = bladeManufacturer;
    }
}
