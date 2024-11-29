package serilization.video;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws FileNotFoundException {
        String videoloc="C:\\Users\\shaik\\OneDrive\\Desktop\\videosd\\video\\myvideo.mp4";
        String newPlace="C:\\Users\\shaik\\OneDrive\\Desktop\\videosd\\file\\video.txt";
        File f1=new File(videoloc);
        File f2=new File(newPlace);
        try(FileOutputStream fis=new FileOutputStream(f2);
            ObjectOutputStream ois=new ObjectOutputStream(fis)){
            long len=f1.length();
            byte[] buffer=new byte[(int)len];
            video v=new video("video",buffer,len);

            ois.writeObject(v);





        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}


