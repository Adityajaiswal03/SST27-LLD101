public class AllInOneMachine implements Printer, Fax, Scanner {
    private Printer printer;
    private Fax fax;
    private Scanner scanner;

    public AllInOneMachine(Printer printer, Fax fax, Scanner scanner) {
        this.printer = printer;
        this.fax = fax;
        this.scanner = scanner;
    }

    @Override
    public void print(String text) {
        printer.print(text);
    }

    @Override
    public void fax(String number) {
        fax.fax(number);
    }

    @Override
    public void scan(String destPath) {
        scanner.scan(destPath);
    }
}
