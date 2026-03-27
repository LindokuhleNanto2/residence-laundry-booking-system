/*
 * Name:Libolwethu Nonkenke
 *Student Nr: 222665963
 * Date: 20 March 2026  */


package za.ac.cput.factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.TimeSlot;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class TimeSlotFactoryTest {

    @Test
    void createTimeSlot() {

        TimeSlot slot = TimeSlotFactory.createTimeSlot(
                "001",
                LocalTime.of(6, 0),
                LocalTime.of(9, 0)
        );

        assertNotNull(slot);
        assertEquals("001", slot.getTimeSlotId());
        assertEquals(LocalTime.of(6,0), slot.getStartTime());
        assertEquals(LocalTime.of(9,0), slot.getEndTime());
    }
}