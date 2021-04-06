public class Main {
    public static void main(String[] args) {

        Time Time = new Time(9, 22, 12);

        System.out.println(Time);
        Time.setHour(1);
        Time.setMinute(0);
        Time.setSecond(0);
        Time.previousSecond();
        System.out.println(Time);
        Time Time2 = new Time(12, 59, 59);
        Time2.nextSecond();
        System.out.println(Time2);




    }


    }
