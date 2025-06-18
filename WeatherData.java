import javax.swing.*;
import java.awt.*;

public class WeatherData {
    private final String name;
    private final double latitude;
    private final double longitude;
    public static UranaiUtil uranaiUtil = new UranaiUtil();

    public WeatherData(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // --- 占い行生成メソッド ---
    public static class UranaiUtil {
        public JPanel createUranaiRow(String line, String imageFile) {
            JPanel row = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));
            row.setOpaque(false);
            JLabel textLabel = new JLabel(line);
            textLabel.setFont(new java.awt.Font("Yu Gothic UI", java.awt.Font.BOLD, 28));
            textLabel.setForeground(new java.awt.Color(120, 80, 180));
            row.add(textLabel);
            if (imageFile != null) {
                ImageIcon icon = new ImageIcon(imageFile);
                Image scaled = icon.getImage().getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                row.add(new JLabel(new ImageIcon(scaled)));
            }
            return row;
        }

        public JPanel createUranaiSubRow(String item, String training) {
            JPanel subRow = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 8, 0));
            subRow.setOpaque(false);
            JLabel itemLabel = new JLabel(item);
            itemLabel.setFont(new java.awt.Font("Yu Gothic UI", java.awt.Font.PLAIN, 20));
            itemLabel.setForeground(new java.awt.Color(80, 120, 180));
            JLabel trainingLabel = new JLabel(training);
            trainingLabel.setFont(new java.awt.Font("Yu Gothic UI", java.awt.Font.PLAIN, 20));
            trainingLabel.setForeground(new java.awt.Color(80, 120, 180));
            subRow.add(itemLabel);
            subRow.add(trainingLabel);
            subRow.setBorder(BorderFactory.createEmptyBorder(0, 24, 0, 0));
            return subRow;
        }
    }
}