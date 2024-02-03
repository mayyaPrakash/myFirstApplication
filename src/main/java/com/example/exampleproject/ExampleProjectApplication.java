package com.example.exampleproject;

import com.opencsv.CSVWriter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ExampleProjectApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExampleProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String[]> data = new ArrayList<>();

        // Add data to the list
        data.add(new String[]{"Name", "Age", "City"});
        data.add(new String[]{"John Doe", "25", "New York"});
        data.add(new String[]{"Jane Smith", "30", "San Francisco"});

        // Specify the CSV file path
        String csvFilePath = "output.csv";

        // Write data to CSV
        try (CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFilePath))) {
            csvWriter.writeAll(data);
            System.out.println("CSV file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
