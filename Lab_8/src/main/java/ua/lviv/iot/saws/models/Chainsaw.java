package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Chainsaw extends Saw{
    private Double tankVolume;

    @Builder
    public Chainsaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double tankVolume
    ){
        super(MaterialToSaw.WOOD, DriveType.INTERNAL_COMBUSTION_ENGINE, sawMaterial, person, lengthInCm);
        this.tankVolume = tankVolume;
    }
}
