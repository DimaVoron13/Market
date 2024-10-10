package Market.homework;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class MarketController {
    public final MarketService serv;
    public MarketController(MarketService serv) { this.serv = serv; }

    @GetMapping("/add")
    public String add(@RequestParam("items") List<Integer> items) {
        return serv.add(items);
    };

    @GetMapping("/get")
    public String get() {
        return serv.get().toString();
    }
}
