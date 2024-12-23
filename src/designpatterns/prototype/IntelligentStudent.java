package designpatterns.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    public IntelligentStudent() {
    }

    public IntelligentStudent(int id, String name, String adress, int iq) {
        super(id, name, adress);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    //we will need to override the copy method
    // Java/syntax does not force us to override, hence this can be prone to error
}
