package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class Jigsaw extends Saw {
    private Integer operatingVoltage;

    public Jigsaw(
            final SawMaterial sawMaterial, final Person person,
            final Double lengthInCm, final Integer operatingVoltage
    ) {
        super(MaterialToSaw.WOOD, DriveType.ELECTRIC, sawMaterial, person, lengthInCm);
        this.operatingVoltage = operatingVoltage;
    }

}
