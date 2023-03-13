package homework2.task3;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Magazine extends Book{
    private String article;
}
