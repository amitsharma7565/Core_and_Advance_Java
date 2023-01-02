// 4. Write a Java program to find following from a given path
// --> Number of text files.
// --> Number of document files (doc and docx formats)
// --> Number of PDF files.
// --> Number of audio files
// --> Number of video files
// --> Number of image files (jpeg,gif,png)

// Sample input:
// Enter path: C://Users/Mydata

// Expected Ouput:
// Number of text files : 5
// Number of document files : 3
// Number of PDF files. : 4
// Number of audio files : 2
// Number of video files : 5
// Number of image files : 20
import java.io.*;

class CountFile {
  public static void main(String args[]) throws IOException {
    int textCount = 0, pdfCount = 0, docxCount = 0, imageCount = 0, songCount = 0, videoCount = 0;

    File file = new File("/home/runner/Fast-Track-Java-AmitSharma62/Day60FileHandling/Mydata");
    // System.out.println(file.getAbsoluteFile())
    String listf[] = file.list();
    for (int i = 0; i < listf.length; i++) {
      if (listf[i].endsWith(".txt")) {
        textCount++;
      } else if (listf[i].endsWith(".pdf")) {
        pdfCount++;
      } else if (listf[i].endsWith(".docx") || listf[i].endsWith(".doc")) {
        docxCount++;
      } else if (listf[i].endsWith(".mp3")) {
        songCount++;
      } else if (listf[i].endsWith(".mp4")) {
        videoCount++;
      } else {
        imageCount++;
      }

    }
    System.out.println("Number of text files :" + textCount);
    System.out.println("Number of document files :"+ docxCount);
    System.out.println("Number of PDF files. :"+pdfCount);
    System.out.println("Number of audio files :"+songCount);
    System.out.println("Number of video files :"+videoCount);
    System.out.println("Number of image files :"+imageCount);
  }
}
