package ua.lviv.iot.saws.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SawMaterial {
    private String handleMaterial;
    private String bladeMaterial;

    public String getHeaders(){
        return "handle_material,blade_material";
    }
}
