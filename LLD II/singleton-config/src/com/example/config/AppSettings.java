package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private final Properties props = new Properties();
    private volatile static AppSettings appSettings;
    private AppSettings() { } // should not be public for true singleton

    public static AppSettings getInstance() {
        if(appSettings == null) {
            synchronized (AppSettings.class) {
                if(appSettings == null) {
                    appSettings = new AppSettings();
                }
            }

        }
        return appSettings; // returns a fresh instance (bug)
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
    @Serial
    private Object readResolve() {
        return getInstance();
    }
}
