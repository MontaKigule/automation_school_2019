public class Teacher {

    public void setAverageScore(Pupil pupil, int score) {
        pupil.setAverageScore(score);
    }

    public boolean isPassed(Pupil pupil) {
        if (pupil.getAverageScore() > 70) {
            return true;
        } else return false;
    }

    public Boolean isSchoolSuccess(School school) {
        int averageSchoolScore = 0;
        int index = 0;
        for (Pupil pupil : school.getPupils()) {
            index++;
            averageSchoolScore += pupil.getAverageScore();
        }
        if (averageSchoolScore / index > 60) {
            return true;
        } else return false;
    }

}
