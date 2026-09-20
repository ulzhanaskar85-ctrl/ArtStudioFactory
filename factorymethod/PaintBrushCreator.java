package factorymethod;

public class PaintBrushCreator extends ArtToolCreator {

    @Override
    public ArtTool createArtTool() {
        return new PaintBrush();
    }
}
