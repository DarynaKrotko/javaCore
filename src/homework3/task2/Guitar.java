package homework3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument{
    private int strings;
    @Override
    public void play() {
        System.out.println("Playing a "+ this.getClass().getSimpleName() + " with "+ this.strings + " strings");
    }
}
