public class LogLevels {
    public static String message(String logLine) {
        String[] logLines = logLine.split(":");
        return logLines[logLines.length - 1].trim();
    }

    public static String logLevel(String logLine) {
        String[] logLines = logLine.split(":");
        String logName = (logLines[0]).substring(1, logLines[0].length() - 1);
        return logName.toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " (" + LogLevels.logLevel(logLine) + ")";
    }

    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.logLevel("[WARNING]:  Disk almost full\r\n"));
        System.out.println(LogLevels.reformat("[ERROR]: Invalid operation"));
    }
}