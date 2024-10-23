package Camera;

public class main {
    public static void main(String[] args) {
        Producer pro = new Producer("Canon", "Japan");
        LensProducer lenPro = new LensProducer("Zeis", "Germany");
        Lens lens = new Lens(25);
        Camera cam = new Camera(0.5, "black", Camera.Resolution.Mittel);

        // Camera properties
        System.out.println(cam.getResolution());
        System.out.println(cam.getWeight());
        System.out.println(cam.getColor());
        System.out.println(pro.getProducerCountry());
        System.out.println(pro.getProducerName());
        System.out.println(lenPro.getProducerName());
        System.out.println(lenPro.getProducerCountry());
        System.out.println(lens.getFocalLength());
        System.out.println("-------------------------------");

        // Camera features
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.takePicture();
        cam.printAllImages();
    }
}
