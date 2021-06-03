
package binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(String[] a, String x) {
        int z = 0;
        int head = a.length - 1;
        int y;

        while (z <= head) {
            y = (z + head) / 2;

            if (a[y].compareTo(x) < 0) {
                z = y + 1;
                } else if (a[y].compareTo(x) > 0) {
                    head = y - 1;
                } else {
                    return y;
                }
        }
        return -1;
    }
    
     public static int process(String[] dataUnsp, String cari){    
        
        for(int c = 0 ; c < dataUnsp.length;c++ )
        {
            if(cari.equals(dataUnsp[c]))
            {
                int dataOut = c;
                return dataOut;
            }       
        }    
        return 0;
    }       

      public static void main(String[] args) {     
        
        String ID[] ={"buku","pintu","pensil","pulpen","penggaris","penghapus","tas","sepatu","sepeda motor","mobil","meja","kursi","minuman","makanan","lampu","makan","bantal","bola","botol","air","rumah","mangga"};
        String cacheID[] = ID.clone();
        String ENG[] ={"book","door","pencil","pen","ruler","eraser","bag","shoes","motorcycle","car","table","chair","drink","food","lamp","eat","pillow","ball","bottle","water","house","mango"};
        String cacheENG[] = ENG.clone();  
        
       
        
        // Cari Kosakata ID/ENG
       
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println(">>> Cari Kosakata Menggunakan Huruf Kecil <<<");
        String search = keyboard.nextLine();
          System.out.println("\nTerjemahkan : " + search);

        int idOutput = process(cacheID,search);
        int enOutput = process(cacheENG,search);
   
        Arrays.sort(ID);
        Arrays.sort(ENG);
        int idResult = binarySearch(ID,search);
        int enResult = binarySearch(ENG,search);   
       
        if(idResult == -1 && enResult == -1)
        {
            System.out.println("\n||==============================================||");
            System.out.println("||\t     Terjemahan Tidak Ditemukan\t\t||");
            System.out.println("||==============================================||");
        }
         else
            {   for(int y = 0; y <= ID.length; y++)
                {           
                    if(search.equals(ID[y]))
                    {
                      System.out.println("\n||==============================================================||");
                      System.out.println("||                           TERJEMAHAN                         ||");
                      System.out.println("||==============================================================||");
                      System.out.println("||            Indonesia           ||           Inggris          ||");
                      System.out.println("||--------------------------------||----------------------------||");
                      System.out.println("||            " +search + "             ||" + "           " + cacheENG[idOutput] + "           ||");
                      System.out.println("||==============================================================||");
                      break;
                    }
                    else if (search.equals(ENG[y]))
                    {
                        System.out.println("\n||===============================================================||");
                        System.out.println("||                          TERJEMAHAN                           ||");
                        System.out.println("||===============================================================||");
                        System.out.println("||            Inggris           ||            Indonesia          ||");
                        System.out.println("||------------------------------||-------------------------------||");
                        System.out.println("||            "+ search + "           ||" + "           " + cacheID[enOutput] + "           ||");
                        System.out.println("||===============================================================||");
                        break;
                                            }
                    else {
                      
                        
                }
            }
        }
        
    }
    
}
