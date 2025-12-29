package Classes;

class Athlete {
    private String name;

    public Athlete(String name) {
        this.name = name;
    }

    class TrainingSchedule {
        public void showSchedule() {
            System.out.println("Showing training plan for " + name);
        }
    }

    static class FitnessStandards {
        public static void showGeneralRequirements() {
            System.out.println("Common list of rules");
        }
    }
}

public class AthletePerformanceTracker {
    public static void main(String[] args) {
        // Athlete.FitnessStandards fitnessStandards = new Athlete.FitnessStandards();
        Athlete.FitnessStandards.showGeneralRequirements();

        Athlete player = new Athlete("X");
        Athlete.TrainingSchedule trainingSchedule = player.new TrainingSchedule();
        trainingSchedule.showSchedule();
    }
}
