package EnumPractice;


public enum DayOfWeek {
    MON("月曜日"), TUE("火曜日"), WED("水曜日"), THU("木曜日"),FRI("金曜日"), SAT("土曜日"), SUN("日曜日");

    private final String label;

    DayOfWeek(String label) {
        this.label = label;
    }

    public String getLabel(){
        return label;
    }

    public static DayOfWeek getDayOfWeek(int week) {
        String label = "SUN";

//        String result = calendar.substring(6, 11);
        switch(week) {
            case 1 ->  label = "日曜日";
            case 2 ->  label = "月曜日";
            case 3 ->  label = "火曜日";
            case 4 ->  label = "水曜日";
            case 5 ->  label = "木曜日";
            case 6 ->  label = "金曜日";
            case 7 ->  label = "土曜日";
            default ->  label = "不正";
        }
        for (DayOfWeek dow : values()) {
            if (dow.label.equals(label)) {
                return dow;
            }
        }
        throw new IllegalArgumentException("Invalid DayOfWeek label: " + label);
    }
}
