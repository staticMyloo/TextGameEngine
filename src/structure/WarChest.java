package structure;

import java.util.ArrayList;
import java.util.List;

public class WarChest extends Openable {

    private final ArrayList<Pickup> chestItems;
    public WarChest(String description) {
        super(description);
        this.chestItems = null;
    }

    public WarChest(String description, Pickup[] items) {
        super(description);
        this.chestItems = new ArrayList<>(List.of(items));
    }

    public WarChest(String description, Pickup item) {
        super(description);
        this.chestItems = new ArrayList<>();
        chestItems.add(item);
    }

    public ArrayList<Pickup> getChestItems() {
        return chestItems;
    }

}
