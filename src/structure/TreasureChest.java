package structure;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest extends Openable {

    public TreasureChest(String description) {
        super(description);

    }

    public TreasureChest(String description, Pickup[] items) {
        super(description, items);
    }

    public TreasureChest(String description, Pickup item) {
        super(description, item);
    }
}
