package serilization.video;

import java.io.Serializable;

public class video implements Serializable {
    private String filename;
    private byte[] data;
    private long size;
    private static final int cod=1;

    public video(String filename, byte[] data, long size) {
        this.filename = filename;
        this.data = data;
        this.size = size;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}


