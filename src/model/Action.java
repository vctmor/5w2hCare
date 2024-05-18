package model;

import java.time.LocalDate;

public class Action {

    private int ri;
    private String name;
    private LocalDate starDate;
    private LocalDate endDate;

    public Action(int ri,String name, LocalDate starDate, LocalDate endDate){

        this.ri = ri;
        this.name = name;
        this.starDate = starDate;
        this.endDate = endDate;

        System.out.println("RI: " + ri);
    }

    
    
}
