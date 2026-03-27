/*
 * Name:Libolwethu Nonkenke
 *Student Nr: 222665963
 * Date: 19 March 2026  */


package za.ac.cput.factory;

import za.ac.cput.domain.TimeSlot;
import java.time.LocalTime;

public class TimeSlotFactory {

    public static TimeSlot createTimeSlot(String timeSlotId,
                                          LocalTime startTime,
                                          LocalTime endTime) {

        if (timeSlotId == null || startTime == null || endTime == null) {
            return null;
        }

        return new TimeSlot.Builder()
                .setTimeSlotId(timeSlotId)
                .setStartTime(startTime)
                .setEndTime(endTime)
                .build();
    }
}