package ua.lviv.iot.saws.models;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TwoManSaw extends MechanicalSaw{
    private Person secondUser;
    
    public TwoManSaw(
            SawMaterial sawMaterial, Person person, Double lengthInCm, Double toothSizeInMm, Person secondUser
    ){
        super(MaterialToSaw.WOOD, sawMaterial, person, lengthInCm, toothSizeInMm);
        this.secondUser = secondUser;
    }
}
