package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tube implements Instrument{
    private int diameter;
    @Override
    public void play() {
        System.out.println("Playing a "+ this.getClass().getSimpleName() + " of this diameter:"+ this.diameter);
    }
}
