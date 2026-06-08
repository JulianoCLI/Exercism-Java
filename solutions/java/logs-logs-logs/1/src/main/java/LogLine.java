public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        return switch (logLine.substring(1, 4)) {
            case "INF" -> LogLevel.INFO;
            case "DBG" -> LogLevel.DEBUG;
            case "FTL" -> LogLevel.FATAL;
            case "ERR" -> LogLevel.ERROR;
            case "WRN" -> LogLevel.WARNING;
            case "TRC" -> LogLevel.TRACE;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        var log = logLine.split(":");
        var msg = log[1].trim();
        return switch (log[0]) {
            case "[TRC]" ->"1:" + msg;
            case "[DBG]" -> "2:" + msg;
            case "[INF]" -> "4:" + msg;
            case "[WRN]" -> "5:" + msg;
            case "[ERR]" -> "6:" + msg;
            case "[FTL]" -> "42:" + msg;
            default -> "0:" + msg;
        };
    }
}
