package sg.edu.nus.iss.day12workshop;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    
        public List<Item> getShoppingItems() {
            
            List<Item> listItems = new ArrayList<>();

            Item itm = new Item();
            itm.setItemName("Backpack");
            itm.setQuantity(2); // remember integer type has no quotes.
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Prada Wallet");
            itm.setQuantity(3);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Laptop");
            itm.setQuantity(1);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Shoe");
            itm.setQuantity(1);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Prada Glasses");
            itm.setQuantity(2);
            listItems.add(itm);


            return listItems;


        }
}
