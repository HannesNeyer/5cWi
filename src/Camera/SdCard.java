package Camera;

import java.util.ArrayList;
import java.util.List;

public class SdCard
{
    private int capacity = 16;
    private List<SdFiles> cameraFiles;

    public SdCard() {
        this.cameraFiles = new ArrayList<>();
    }

    public void SaveCamereaFiles(SdFiles file){
        this.cameraFiles.add(file);
    }

    public List<SdFiles> getCameraFiles() {
        return cameraFiles;
    }

    public void setCameraFiles(List<SdFiles> cameraFiles) {
        this.cameraFiles = cameraFiles;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
