package ua.lviv.iot.saws.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
public class TwoManSaw extends MechanicalSaw {
    private Integer secondUserId;

    public TwoManSaw(
            final SawMaterial sawMaterial, final Integer userId,
            final Double lengthInCm, final Double toothSizeInMm, final Integer secondUserId
    ) {
        super(MaterialToSaw.WOOD, sawMaterial, userId, lengthInCm, toothSizeInMm);
        this.secondUserId = secondUserId;
    }
}
