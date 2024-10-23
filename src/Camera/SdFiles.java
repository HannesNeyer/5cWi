package Camera;

public class SdFiles
{
    private String dataTyp;
    private int fileSize;
    private String fileName;
    private String fileDate;

    public SdFiles(String dataTyp, int fileSize, String fileName, String fileDate) {
        this.dataTyp = dataTyp;
        this.fileSize = fileSize;
        this.fileName = fileName;
        this.fileDate = fileDate;
    }

    public String getDataTyp() {
        return dataTyp;
    }

    public void setDataTyp(String dataTyp) {
        this.dataTyp = dataTyp;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDate() {
        return fileDate;
    }

    public void setFileDate(String fileDate) {
        this.fileDate = fileDate;
    }
}
