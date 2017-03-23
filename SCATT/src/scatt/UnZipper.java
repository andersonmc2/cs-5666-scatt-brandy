package scatt;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author Matt Stone
 * @version 1.0
 * 
 */
public class UnZipper
{
    final static int BUFFER = 2048;

    /**
     * @param zippedDirectory the path to the .sb2
     */
    public UnZipper(String zippedDirectory)
    {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param argv cmd line args
     */
    public static void main(String argv[])
    {
        try
        {
            String buildPath = System.getProperty("user.dir");
            String path = "Pong Starter.sb2";
            path = buildPath + "\\src\\scatt\\" + path;
            String outputPath = "";
            //String outputPath = "\\src\\scatt\\output\\";
            File ouputDir = new File(buildPath + outputPath);
            ouputDir.mkdir();

            // feed bos to file
            BufferedOutputStream dest = null;

            // for reading the zip file
            FileInputStream fis = new FileInputStream(path);
            ZipInputStream zis = new ZipInputStream(
                    new BufferedInputStream(fis));
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null)
            {
                System.out.println("Extracting: " + entry);
                int count;
                byte data[] = new byte[BUFFER];
                // write the files to the disk
                FileOutputStream fos = new FileOutputStream(outputPath
                        + entry.getName());
                dest = new BufferedOutputStream(fos, BUFFER);
                while ((count = zis.read(data, 0, BUFFER)) != -1)
                {
                    dest.write(data, 0, count);
                }
                dest.flush();
                dest.close();
            }
            zis.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    /**
     * 
     * @return String representation of unzippped file path, or null if fail
     */
    public String unZip()
    {
        // TODO Auto-generated method stub
        return null;
    }

    
    /**
     *  Cleans created file path from unzip method.  
     */
    public void clean()
    {
        // TODO Auto-generated method stub
        
    }
}
