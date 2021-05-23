package ua.lviv.iot.saws.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class SawMaterial {

    private String handleMaterial;

    private String bladeMaterial;

}
