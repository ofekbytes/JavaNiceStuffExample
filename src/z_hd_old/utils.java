package z_hd_old;

import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.SourceDataLine;



public class utils
{

    //public static void playSoundFile(File soundFile)
    public static void playSoundFile(InputStream inputStream, boolean wait)
    {
        try
        {
            // Get an AudioInputStream
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
            // Get the AudioFormat for the AudioInputStream
            AudioFormat audioFormat = audioInputStream.getFormat();
            // Checking for a supported output line
            DataLine.Info datalineinfo = new DataLine.Info (SourceDataLine.class,audioFormat);
            if (AudioSystem.isLineSupported(datalineinfo))
            {
                // Opening the sound output line
                SourceDataLine sourcedataline = (SourceDataLine)AudioSystem.getLine(datalineinfo);
                sourcedataline.open(audioFormat);
                sourcedataline.start();
                // Copy data from the input stream to the output data line
                int frameSizeInBytes = audioFormat.getFrameSize();
                int bufferLengthInFrames   = sourcedataline.getBufferSize() / 8;
                int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
                byte[] soundData = new byte[bufferLengthInBytes];
                int numberOfBytesRead = 0;
                while ((numberOfBytesRead = audioInputStream.read(soundData)) != -1)
                {
                    //int numberofbytesremaining = numberOfBytesRead;
                    sourcedataline.write(soundData,0,numberOfBytesRead);
                }
                
                if (wait)
                {
                    // Wait until all data are played
                    sourcedataline.drain();
                    // All data are played. We can close the shop
                    sourcedataline.close();
                    
                    //sourcedataline.flush();
                    //sourcedataline.stop();
                    
                    //if (sourcedataline.isRunning())
                    //{
                    //    System.out.println ( "aaa");
                    //}
                    //sourcedataline.notifyAll();
                }
            }
        }
        catch(Exception e)
        {
            ;
        }
    } 
    public static void main(String[] args)
    {	
       
    }
}

