package org.example;


import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageProcessor {
    public static void main(String[] args) {

        StringBuilder imgSim = new StringBuilder("");
        try {

            File file = new File("src/main/resources/img_4.png");
            BufferedImage image = ImageIO.read(file);
            for (int y = 0; y < image.getHeight(); y++) {
                for (int x = 0; x < image.getWidth(); x++) {
                    Color color = new Color(image.getRGB(x, y));
                    int brightness = (color.getRed() + color.getGreen() + color.getBlue()) / 3;
                    if (0 <= brightness && brightness <= 15) {
                        imgSim.append(" ");
                    } else if (16 <= brightness && brightness <= 31) {
                        imgSim.append(".");
                    } else if (32 <= brightness && brightness <= 47) {
                        imgSim.append(",");
                    } else if (48 <= brightness && brightness <= 63) {
                        imgSim.append(";");
                    } else if (64 <= brightness && brightness <= 79) {
                        imgSim.append(":");
                    } else if (80 <= brightness && brightness <= 95) {
                        imgSim.append("!");
                    } else if (96 <= brightness && brightness <= 111) {
                        imgSim.append("?");
                    } else if (112 <= brightness && brightness <= 127) {
                        imgSim.append("'");
                    } else if (128 <= brightness && brightness <= 143) {
                        imgSim.append("\"");
                    } else if (144 <= brightness && brightness <= 159) {
                        imgSim.append("#");
                    } else if (160 <= brightness && brightness <= 175) {
                        imgSim.append("$");
                    } else if (176 <= brightness && brightness <= 191) {
                        imgSim.append("%");
                    } else if (192 <= brightness && brightness <= 207) {
                        imgSim.append("&");
                    } else if (208 <= brightness && brightness <= 223) {
                        imgSim.append("*");
                    } else if (224 <= brightness && brightness <= 239) {
                        imgSim.append("+");
                    } else if (240 <= brightness && brightness <= 255) {
                        imgSim.append("@");
                    }


                }
                imgSim.append("\n");
            }

            System.out.println(imgSim);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
