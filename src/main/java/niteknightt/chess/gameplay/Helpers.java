package niteknightt.chess.gameplay;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// TODO: This class should not be here -- it exists in common. Fix.

public class Helpers {

    private static long lastLogId;
    private static boolean lastLogIdLoaded = false;
    private static Lock logIdLock = new ReentrantLock(true);
    private static Date appStartDate = new Date();

    public static long LOG_ID_INCREMENT = 100000l;
    public static String LAST_LOG_ID_FILE_NAME = "lastLogId.txt";
    public static SimpleDateFormat formatForFilename = new SimpleDateFormat("yyyyMMddHHmmss");
    public static SimpleDateFormat formatForLog = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    public static Date appStartDate() { return appStartDate; }

    public static String formatDateForFilename(Date date) {
        return formatForFilename.format(date);
    }

    public static String formatDateForLog(Date date) {
        return formatForLog.format(date);
    }

    public static Enums.PieceType letterToPieceType(char letter) {
        switch (letter) {
            case 'N':
                return Enums.PieceType.KNIGHT;
            case 'B':
                return Enums.PieceType.BISHOP;
            case 'R':
                return Enums.PieceType.ROOK;
            case 'Q':
                return Enums.PieceType.QUEEN;
            case 'K':
                return Enums.PieceType.KING;
            default:
                throw new RuntimeException("Failed to find piece type for letter " + letter);
        }
    }
}
