/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.investmentbank;

import static com.bms.ui.investmentbank.InvestmentMainJPanel.HISTORYFILEPATH;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.*;
import org.jfree.chart.plot.*;

import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author asawari
 */
public class CreateGraph {
    String fileName;
    JFrame frame;
    JPanel chartPanel;
    
    // Class constructor
    public CreateGraph(String fName) {

        fileName = fName;
        frame = new JFrame(fileName + " Change");

        chartPanel = new JPanel();

        try {
            chartPanel = createChartPanel();

        } catch (NumberFormatException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.WARNING_MESSAGE);
        }
        frame.add(chartPanel, BorderLayout.CENTER);

        frame.setSize(640, 480);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        Timer t2 = new Timer();

        t2.schedule(new TimerTask() {
            @Override
            public void run() {

                try {
                    chartPanel = createChartPanel();
                    frame.getContentPane().removeAll();
                    frame.add(chartPanel);
                    frame.revalidate();
                    frame.repaint();
                } catch (NumberFormatException | IOException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e, "Error", JOptionPane.WARNING_MESSAGE);
                }

            }
        }, 0, 10000);
    }
    
    // Method to create the JPanel where the chart will be displayed
    private JPanel createChartPanel() throws NumberFormatException, IOException {
        String chartTitle = fileName + " Change";
        String xAxisLabel = "X";
        String yAxisLabel = "Y";

        XYDataset dataset = createDataset();

        JFreeChart chart = ChartFactory.createXYLineChart(chartTitle, xAxisLabel, yAxisLabel, dataset);

        XYPlot plot = (XYPlot) chart.getPlot();
        ValueAxis range = plot.getDomainAxis();

        range.setVisible(false);

        return new ChartPanel(chart);
    }

    // Method to create the set of data using the stock rate for the chart
    private XYDataset createDataset() throws NumberFormatException, IOException {
        XYSeriesCollection dataSet = new XYSeriesCollection();
        XYSeries series = new XYSeries("Price");

        BufferedReader readData = new BufferedReader(new FileReader(HISTORYFILEPATH + fileName + ".csv"));

        String line;

        double count = 0;

        while ((line = readData.readLine()) != null) {
            count++;

            String[] data = line.split(",");
            series.add(count, Double.parseDouble(data[1]));

        }

        dataSet.addSeries(series);
        return dataSet;
    }

    
}
