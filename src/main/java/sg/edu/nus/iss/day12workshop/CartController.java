package sg.edu.nus.iss.day12workshop;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

// always annotate 
@Controller
@RequestMapping(path = { "/cart" })
public class CartController {

    @GetMapping(produces = { "text/html" })
    public String displayCart(Model model) {
        CartService cs = new CartService();
        List<Item> cartItems = cs.getShoppingItems();
        model.addAttribute("cart", cartItems);

        return "cart"; // sensitive
    }

@GetMapping("{itemname}")
public String filteredCart(
    @PathVariable (name="itemname", required = true) String itemname, Model model){
    CartService cs = new CartService();
    List<Item> cartItems = cs.getShoppingItems();

    List<Item> filteredItems = new ArrayList<>();
   for (Item s : cartItems) {
       if (s.getItemName().contains(itemname)) { 
           filteredItems.add(s);
       } // itemname will equals to input on path , case-sensitive
   }
    model.addAttribute("cart", filteredItems); // get from filteredItems not cartItems

    return "cart";

}
}
