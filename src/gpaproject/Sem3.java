
package gpaproject;


public class Sem3 extends Sem2{
    
    public float gpa3;

    public Sem3(float gpa3, float gpa2, float gpa1) {
        super(gpa2, gpa1);
        this.gpa3 = gpa3;
    }

    public float getGpa3() {
        return gpa3;
    }

    public void setGpa3(float gpa3) {
        this.gpa3 = gpa3;
    }

   
    public void SGPA(){
        
       float avg_gpa = (gpa1+gpa2+gpa3)/3;
       
       System.out.println("Avarage GPA: "+avg_gpa);
       System.out.println("");
    }
    
}
