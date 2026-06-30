class UniversityMember {

    public void attendLecture() {
        System.out.println("Attending a lecture.");
    }
}

interface Researcher {
    void conductLabResearch();
}


class UndergraduateStudent extends UniversityMember {
    
}


class GRA extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("GRA: Assisting in experiments and research work.");
    }
}

class Professor extends UniversityMember implements Researcher {

    @Override
    public void conductLabResearch() {
        System.out.println("Professor: Publishing papers and leading research.");
    }
}


public class Main5 {
    public static void main(String[] args) {

        UniversityMember student = new UndergraduateStudent();
        student.attendLecture();

        System.out.println();

        Researcher gra = new GRA();
        gra.conductLabResearch();

        System.out.println();

        Researcher prof = new Professor();
        prof.conductLabResearch();
    }
}

