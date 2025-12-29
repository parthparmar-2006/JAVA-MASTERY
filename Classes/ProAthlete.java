package Classes;

abstract class Athlete {
    private String name;
    private String team;

    public Athlete(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + " from " + team);
    }

    public abstract void calculateBonus();
}

class Footballer extends Athlete {
    private int goalScored;

    public Footballer(String name, String team, int goalScored) {
        super(name, team);
        this.goalScored = goalScored;
    }

    @Override
    public void calculateBonus() {
        System.out.println("Footballer Bonus: $" + goalScored*500);
    }
}

class Cricketer extends Athlete {
    private int runScored;

    public Cricketer(String name, String team, int runScored) {
        super(name, team);
        this.runScored = runScored;
    }

    @Override
    public void calculateBonus() {
        System.out.println("Circketer Bonus: $" + runScored*10);
    }
}

public class ProAthlete {
    public static void main(String[] args) {
        Footballer footballer = new Footballer("X", "T1", 12);
        Cricketer cricketer = new Cricketer("Y", "T2", 56);

        footballer.introduce();
        footballer.calculateBonus();
        cricketer.introduce();
        cricketer.calculateBonus();
    }
}
