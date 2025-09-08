package com.example.report;

import java.nio.file.Path;

public class ReportBundleFacade {
    JsonWriter jw;
    Zipper z;
    AuditLog log;
    public ReportBundleFacade(JsonWriter jw,Zipper z,AuditLog log){
        this.jw=jw;
        this.z=z;
        this.log=log;
    }
    Path export(java.util.Map<String,Object> data, java.nio.file.Path outDir, String baseName){
        Path json = jw.write(data, Path.of("out"), "report");
        Path zip = z.zip(json, Path.of("out", "report.zip"));
        log.log("exported " + zip);
        System.out.println("DONE " + zip);
        return zip;
    }
}
