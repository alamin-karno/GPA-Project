
package gpaproject;

public class Sem2 extends Sem1{
    
    public float gpa2;

    public Sem2(float gpa2, float gpa1) {
        super(gpa1);
        this.gpa2 = gpa2;
    }

    public float getGpa2() {
        return gpa2;
    }

    public void setGpa2(float gpa2) {
        this.gpa2 = gpa2;
    }
    
}
