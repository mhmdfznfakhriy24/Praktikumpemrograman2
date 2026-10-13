package module03.problem02;

public class Country {
    private String name;
    private String leadershipType;
    private String leaderName;
    private int day;
    private int month;
    private int year;

    // untuk negara dengan tanggal kemerdekaan
    public Country(String name, String leadershipType, String leaderName,
                   int day, int month, int year) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // untuk negara monarki (tanpa tanggal kemerdekaan)
    public Country(String name, String leadershipType, String leaderName) {
        this.name = name;
        this.leadershipType = leadershipType;
        this.leaderName = leaderName;
    }

    public String getName() { return name; }
    public String getLeadershipType() { return leadershipType; }
    public String getLeaderName() { return leaderName; }
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public boolean isMonarchy() {
        return leadershipType.equalsIgnoreCase("monarki");
    }

    public String getTitle() {
        if (isMonarchy()) {
            return "Raja";
        } else if (leadershipType.equalsIgnoreCase("perdana menteri")) {
            return "Perdana Menteri";
        } else {
            return "Presiden";
        }
    }
}
