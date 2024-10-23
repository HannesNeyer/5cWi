package Camera;

import java.util.Arrays;

public class Camera {
    public enum Resolution {
        Klein, Mittel, Groß
    };

    private Resolution resolution;
    private double weight;
    private String color;
    private SdFiles SdFiles;
    private SdCard SdCard;
    private int fileNumber = 0;

    public Camera(double weight, String color, Resolution resolution) {
        this.weight = weight;
        this.color = color;
        this.resolution = resolution;
        this.SdFiles = new SdFiles("jpg", 6, "768zvzu7rtzt7iugz" + fileNumber, "13.04.2023");
        this.SdCard = new SdCard();
    }

    public SdFiles takePicture() {
        if (SdCard.getCapacity() > this.SdFiles.getFileSize()) {
            System.out.println("processing image");
            SdCard.setCapacity(SdCard.getCapacity() - this.SdFiles.getFileSize());
            this.SdCard.SaveCamereaFiles(SdFiles);
            System.out.println("Saved successfully");
            fileNumber++;

            if (SdCard.getCapacity() <= 6) {
                System.out.println("Capacity is running low " + SdCard.getCapacity() + " GB remain");
            }
        } else {
            System.out.println("Not enough space, please add a new SD card");
            this.SdCard.setCapacity(64);
            System.out.println("SD card has been successfully switched " + SdCard.getCapacity() + " remain");
        }
        return SdFiles;
    }

    public SdFiles printAllImages() {
        return SdFiles;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
}