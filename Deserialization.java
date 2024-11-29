package serilization.video;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) throws Exception{
        String newPlace="C:\\Users\\shaik\\OneDrive\\Desktop\\videosd\\file\\video.txt";
        String w="C:\\Users\\shaik\\OneDrive\\Desktop\\videosd\\file\\vide.mp4";
        File f=new File(newPlace);
        try(FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis)){
            video video = (video) ois.readObject();
            byte []videodata=video.getData();
            try (FileOutputStream fos = new FileOutputStream(w)) {
                fos.write(videodata);  // Write the byte data to the file
                System.out.println("Video deserialized and saved to " + w);
            }
        }
    }
}
