package Market.homework;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Component
@SessionScope
public class Container {
    private List<Integer> item;

    public Container(List<Integer> item) {
        this.item = item;
    }

    public List<Integer> getItem() { return item; }
    public void setItem(List<Integer> item) { this.item = item; }
    public void addItem(List<Integer> temp) {
        List<Integer> ite = this.getItem();
        ite.addAll(temp);
        this.item = ite;
    }

    @Override
    public String toString() {
        return this.item.toString();
    }
}
