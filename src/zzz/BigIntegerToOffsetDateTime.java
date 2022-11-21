package zzz;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class BigIntegerToOffsetDateTime {

    private OffsetDateTime createOffsetDateTime(String lastUpdatedDateTime) {
        ZoneId zoneId = ZoneId.of("UTC");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime dateTime = LocalDateTime.parse(lastUpdatedDateTime, formatter);
        ZoneOffset offsetStatus = zoneId.getRules().getOffset(dateTime);
        return OffsetDateTime.of(dateTime, offsetStatus);
    }

    public static void main(String[] args) {
        BigIntegerToOffsetDateTime bigIntegerToOffsetDateTime = new BigIntegerToOffsetDateTime();

        OffsetDateTime lastUpdatedStatus = bigIntegerToOffsetDateTime.createOffsetDateTime(
                String.format(
                        "%08d%06d", new BigInteger("20180102"), new BigInteger("135545")
        )
        );
        System.out.println(lastUpdatedStatus);


    }
}
