package abstractfactory;

public class TraditionalCanvas implements ArtMaterial {

    @Override
    public void prepare() {
        System.out.println("Preparing a traditional canvas");
    }
}
