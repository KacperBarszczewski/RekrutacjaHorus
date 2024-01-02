import java.util.List;
import java.util.stream.Collectors;

public class ImplementacjaCompositeBlock implements CompositeBlock {
    private List<Block> blocks;
    @Override
    public String getColor() {
        return blocks.isEmpty() ? "" : blocks.get(0).getColor();
    }

    @Override
    public String getMaterial() {
        return blocks.isEmpty() ? "" : blocks.get(0).getMaterial();
    }

    @Override
    public List<Block> getBlocks() {
        return this.blocks;
    }
}
