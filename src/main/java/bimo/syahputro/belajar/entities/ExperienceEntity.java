package bimo.syahputro.belajar.entities;

import javax.persistence.*;

@Entity
@Table(name = "experience")
public class ExperienceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String employmentType;
    private String companyName;
    private String location;
    private String startDate;
    private String endDate;
    private String industry;
    private String description;

    public ExperienceEntity(int id, String title, String employmentType, String companyName, String location, String startDate, String endDate, String industry, String description) {
        this.id = id;
        this.title = title;
        this.employmentType = employmentType;
        this.companyName = companyName;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.industry = industry;
        this.description = description;
    }

    public ExperienceEntity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ExperienceEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", employmentType='" + employmentType + '\'' +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", industry='" + industry + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}