package factorymethod;

public class PaintBrush implements ArtTool {

    @Override
    public void use() {
        System.out.println("Using a paint brush.");
    }
}
