package homework2.task3;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Book extends Papyrus{
    private int pages;
    private String title;
}
