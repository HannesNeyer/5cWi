package Camera;

public class Lens
{
    private int focalLength;
    private LensProducer lensProducer;

    public Lens(int focalLength) {
        this.focalLength = focalLength;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public LensProducer getLensProducer() {
        return lensProducer;
    }
}
