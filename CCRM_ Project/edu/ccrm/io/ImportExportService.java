package edu.ccrm.io;

import edu.ccrm.config.AppConfig;
import edu.ccrm.domain.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class ImportExportService {
    public void exportStudentsToCSV(List<Student> students) throws IOException {
        String header = "RegNo,FullName,Email";
        List<String> studentRecords = students.stream()
            .map(s -> s.getRegNo() + "," + s.getFullName() + "," + s.getEmail())
            .collect(Collectors.toList());
        
        studentRecords.add(0, header);

        Path filePath = Paths.get(AppConfig.getInstance().getDataFolderPath(), "students_export.csv");
        Files.write(filePath, studentRecords, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        System.out.println("Student data exported to: " + filePath.toAbsolutePath());
    }
}
