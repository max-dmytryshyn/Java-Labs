package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class TwoManSaw extends MechanicalSaw {
    private Person secondUser;

    public TwoManSaw(
            final SawMaterial sawMaterial, final Person person,
            final Double lengthInCm, final Double toothSizeInMm, final Person secondUser
    ) {
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.secondUser = secondUser;
    }
}
