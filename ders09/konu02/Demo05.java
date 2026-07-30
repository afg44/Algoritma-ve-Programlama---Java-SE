package ders09.konu02;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/*
Resim dosyası okuma
 */
public class Demo05 {
    public static void main(String[] args) {
        try {
            // Resim dosyasını oku
            File file = new File("res//resim.jpg");
            BufferedImage image = ImageIO.read(file);

            // Resim bilgileri
            int width = image.getWidth();
            int height = image.getHeight();

            System.out.println("Genişlik: " + width);
            System.out.println("Yükseklik: " + height);

            pikselDegeriniOku(image);

        } catch (Exception e) {
            System.out.println("Hata oluştu!");
            e.printStackTrace();
        }
    }

    private static void pikselDegeriniOku(BufferedImage image) {
        int x = 110;
        int y = 54;

        int pixel = image.getRGB(x, y);

        int red = (pixel >> 16) & 0xff;
        int green = (pixel >> 8) & 0xff;
        int blue = pixel & 0xff;

        System.out.println("R: " + red);
        System.out.println("G: " + green);
        System.out.println("B: " + blue);
    }
}