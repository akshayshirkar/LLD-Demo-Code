package immutablity;

import java.util.ArrayList;
import java.util.List;

public final class studentProfile {
    private final String name;
    private final Integer rollNumber;
    private final List<String> subjects;

    public studentProfile(String name,Integer rollNumber,List<String> subjects){
        this.name = name;
        this.rollNumber=rollNumber;
        this.subjects= new ArrayList<>(subjects);

    }
    public String getName(){
        return name;
    }

    public Integer getRollNumber(){
        return rollNumber;
    }

    public List<String> getSubjects(){
        return new ArrayList<>(subjects);
    }


}
