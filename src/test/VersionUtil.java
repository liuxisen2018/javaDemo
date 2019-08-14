package test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author: liuxs
 * @description:
 * @date: Created in 10:02 AM  2019/8/13
 */
public class VersionUtil {

    private static final SimpleDateFormat SDF = new SimpleDateFormat("yyyyMMddHHmmss");

    private VersionUtil() {
    }

    public static String genVersion() {
        synchronized (SDF) {
            return SDF.format(new Date()) + "_" + new Random().nextInt(10000);
        }
    }

}
