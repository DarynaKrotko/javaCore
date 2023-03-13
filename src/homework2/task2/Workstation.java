package homework2.task2;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Workstation extends Laptop{
    private String  graphicTablets;
    private String  touchScreens;
}
