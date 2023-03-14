package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Magazine implements Printable{
    private String article;
    @Override
    public void print() {
        System.out.println(this.article);
    }
}
