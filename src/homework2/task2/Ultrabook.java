package homework2.task2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Ultrabook extends Laptop{
    private String USB;
    private String HDMI;
}
