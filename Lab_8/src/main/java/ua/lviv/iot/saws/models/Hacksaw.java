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
            final SawMaterial sawMaterial, final Person person, final Double lengthInCm,
            final Double toothSizeInMm, final String bladeManufacturer
    ) {
        super(MaterialToSaw.METAL, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.bladeManufacturer = bladeManufacturer;
    }
}
