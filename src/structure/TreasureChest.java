package structure;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest extends Openable {

    private final ArrayList<Pickup> chestItems;

    public TreasureChest(String description) {
        super(description);
        this.chestItems = null;
    }

    public TreasureChest(String description, Pickup[] items) {
        super(description);
        this.chestItems = new ArrayList<>(List.of(items));
    }

    public TreasureChest(String description, Pickup item) {
        super(description);
        this.chestItems = new ArrayList<>();
        chestItems.add(item);
    }

    public ArrayList<Pickup> getChestItems() {
        return chestItems;
    }

}
