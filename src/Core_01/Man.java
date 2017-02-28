package Core_01;

import java.util.Random;

/**
 * Created by Taras on 27.02.2017.
 */
public class Man {

    private Random r = new Random(System.currentTimeMillis());
    private int random = r.nextInt(3);
    private String name;
    private String surname;
    private Job jobList [] = {new Job("офіціант", 4500), new Job("гірник", 13000), new Job("програміст", 35000)};
    private Job job;

    public Man() {
        this.name = "Іван";
        this.surname = "Петрович";
        this.job = getJob();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Job getJob() {
        for(int i = 0; i < jobList.length; i++){
            if(random == i){
                job = jobList[i];
            }
        }
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
