package Camera;

public class Producer {
    private String producerName;
    private String producerCountry;

    public Producer(String producerName, String producerCountry) {
        this.producerName = producerName;
        this.producerCountry = producerCountry;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getProducerCountry() {
        return producerCountry;
    }
}
