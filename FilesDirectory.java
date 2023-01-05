/* 1. Write a Java program to get a list of all files/directory names from the given path using File class object.*/

import java.io.*;
public class FilesDirectory {

    public static void main(String args[]) {
       String path = "/home/runner/Fast-Track-Java-AmitSharma62/FileHandlingUsingByteStreams_Assignment-AmitSharma7565/Folder";
    File directory = new File(path);
    // Get the list of file and directory names in the directory
    String[] fileList = directory.list();
    // Print the file and directory names
    for (String fileName : fileList) {
      System.out.println(fileName);
}
}
}

