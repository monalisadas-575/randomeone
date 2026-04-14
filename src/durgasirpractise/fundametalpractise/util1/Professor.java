package durgasirpractise.fundametalpractise.util1;

class Professor extends Person{
    int professorId;

    public Professor(String name, int professorId) {
        super(name);
        this.professorId = professorId;
    }

    @Override
     void ShowDetails() {
        System.out.println("Professor-> name: "+name+", Id: "+professorId);

    }
}
