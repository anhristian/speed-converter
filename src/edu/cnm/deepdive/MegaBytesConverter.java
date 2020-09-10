package edu.cnm.deepdive;

public class MegaBytesConverter {

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
    } else {
      int kiloBytesToMega = kiloBytes / 1024;
      int megaToKilo = kiloBytes % 1024;
      System.out.println(kiloBytes + "KB = " + kiloBytesToMega + " MB and " + megaToKilo + " KB");

    }

  }
}
