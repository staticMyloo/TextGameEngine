package structure;

import java.util.ArrayList;
import java.util.List;

public class WarChest extends Openable {

    public WarChest(String description) {
        super(description);

    }

    public WarChest(String description, Pickup[] items) {
        super(description, items);

    }

    public WarChest(String description, Pickup item) {
        super(description, item);
    }

}
