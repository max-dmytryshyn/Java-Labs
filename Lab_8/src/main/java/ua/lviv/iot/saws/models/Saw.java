package ua.lviv.iot.saws.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Saw {
    protected MaterialToSaw materialToSaw;
    protected DriveType driveType;
    protected SawMaterial sawMaterial;
    protected Person user;
    protected Double lengthInCm;
}
