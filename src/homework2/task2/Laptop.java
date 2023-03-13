package homework2.task2;

import lombok.*;

@Getter
@Setter
//@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends PC{
    private String battery;
    private String WiFiAdapter;

    @Override
    public String toString() {
        return "Laptop{" +
                "battery='" + battery + '\'' +
                ", WiFiAdapter='" + WiFiAdapter + '\'' +
                "} " + super.toString();
    }
}
