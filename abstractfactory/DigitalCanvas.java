package abstractfactory;

public class DigitalCanvas implements ArtMaterial {

    @Override
    public void prepare() {
        System.out.println("Preparing a digital canvas");
    }
}
