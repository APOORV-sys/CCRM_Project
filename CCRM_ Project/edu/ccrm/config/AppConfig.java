package edu.ccrm.config;

public class AppConfig {
    // 1. Create a private static final instance of the class
    private static final AppConfig INSTANCE = new AppConfig();
    
    private final String dataFolderPath;

    // 2. Make the constructor private
    private AppConfig() {
        // Initialize settings
        this.dataFolderPath = "project_data/";
    }

    // 3. Provide a public static method to get the instance
    public static AppConfig getInstance() {
        return INSTANCE;
    }

    public String getDataFolderPath() {
        return dataFolderPath;
    }
}
