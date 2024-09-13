package org.example.e142;

class SyntaxTechnologies{
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechnologies(){

    }
    SyntaxTechnologies(String schoolName,int batch, int year, String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }

}

public class E142Constructor {
    public static void main(String[] args) {
        SyntaxTechnologies st=new SyntaxTechnologies();
        SyntaxTechnologies stp=new SyntaxTechnologies("Syntax",20,2024,"i dont know");

        st.display();
        stp.display();

    }
}

