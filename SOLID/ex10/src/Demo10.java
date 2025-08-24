public class Demo10 {
    public static void main(String[] args) {
        LoggerI logger = new ConsoleLogger();
        new ReportService(logger).generate();
    }
}
