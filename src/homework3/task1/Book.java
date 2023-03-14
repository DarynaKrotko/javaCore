package homework3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book implements Printable{
    private String title;
    @Override
    public void print() {
        System.out.println(this.title);
    }
}
