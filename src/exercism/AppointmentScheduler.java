import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        if (hour >= 12 && hour < 18) {
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String dayOfWeek = appointmentDate.getDayOfWeek().toString();
        String capDayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1).toLowerCase();
        String time = appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a"));
        return "You have an appointment on " + capDayOfWeek + ", " + appointmentDate.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")) + ", at " + time + ".";
    }

    public LocalDate getAnniversaryDate() {
        int thisYear = LocalDate.now().getYear();
        return LocalDate.of(thisYear, 9, 15);
    }

    public static void main(String[] args) {
        AppointmentScheduler scheduler = new AppointmentScheduler();
//        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));
//        System.out.println(scheduler.hasPassed(LocalDateTime.of(1999, 12, 31, 9, 0, 0)));
//        System.out.println(scheduler.isAfternoonAppointment(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
        System.out.println(scheduler.getDescription(LocalDateTime.of(2019, 03, 29, 15, 0, 0)));
//        System.out.println(scheduler.getAnniversaryDate());
    }
}
