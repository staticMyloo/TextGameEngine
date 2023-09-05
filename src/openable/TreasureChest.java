package openable;
import pickups.Pickup;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest {

    private final ArrayList<Pickup> chestItems;

    public TreasureChest() {
        this.chestItems = null;
    }

    public TreasureChest(Pickup[] items) {
        this.chestItems = new ArrayList<>(List.of(items));
    }


    public ArrayList<Pickup> getChestItems() {
        return chestItems;
    }


}
