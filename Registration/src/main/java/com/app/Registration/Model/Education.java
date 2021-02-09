package com.app.Registration.Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Education {

	@Id
	public String schoolssc;
    public String boardssc;
    public String specializationssc;
    public int percentssc;
    public String gradessc;
    public Date dopssc;
    public String schoolnamehsc;
    public String boardsc;
    public String specializationhsc;
    public int percenthsc;
    public String gradehsc;
    public Date dophsc;
    public String qualification;
    public String stream;
	public String specializationgrad;
    public String university;
    public String college;
    public String courseduration;
    public Date dopgrad;
    public int degreepercent;
    
    
	public Education() {


	}
	
	
	

	public Education(String schoolssc, String boardssc, String specializationssc, int percentssc, String gradessc,
			Date dopssc, String schoolnamehsc, String boardsc, String specializationhsc, int percenthsc,
			String gradehsc, Date dophsc, String qualification, String stream, String specializationgrad,
			String university, String college, String courseduration, Date dopgrad, int degreepercent) {
		super();
		this.schoolssc = schoolssc;
		this.boardssc = boardssc;
		this.specializationssc = specializationssc;
		this.percentssc = percentssc;
		this.gradessc = gradessc;
		this.dopssc = dopssc;
		this.schoolnamehsc = schoolnamehsc;
		this.boardsc = boardsc;
		this.specializationhsc = specializationhsc;
		this.percenthsc = percenthsc;
		this.gradehsc = gradehsc;
		this.dophsc = dophsc;
		this.qualification = qualification;
		this.stream = stream;
		this.specializationgrad = specializationgrad;
		this.university = university;
		this.college = college;
		this.courseduration = courseduration;
		this.dopgrad = dopgrad;
		this.degreepercent = degreepercent;
	}




	public String getSchoolssc() {
		return schoolssc;
	}

	public void setSchoolssc(String schoolssc) {
		this.schoolssc = schoolssc;
	}

	public String getBoardssc() {
		return boardssc;
	}

	public void setBoardssc(String boardssc) {
		this.boardssc = boardssc;
	}

	public String getSpecializationssc() {
		return specializationssc;
	}

	public void setSpecializationssc(String specializationssc) {
		this.specializationssc = specializationssc;
	}

	public int getPercentssc() {
		return percentssc;
	}

	public void setPercentssc(int percentssc) {
		this.percentssc = percentssc;
	}

	public String getGradessc() {
		return gradessc;
	}

	public void setGradessc(String gradessc) {
		this.gradessc = gradessc;
	}

	public Date getDopssc() {
		return dopssc;
	}

	public void setDopssc(Date dopssc) {
		this.dopssc = dopssc;
	}

	public String getSchoolnamehsc() {
		return schoolnamehsc;
	}

	public void setSchoolnamehsc(String schoolnamehsc) {
		this.schoolnamehsc = schoolnamehsc;
	}

	public String getBoardsc() {
		return boardsc;
	}

	public void setBoardsc(String boardsc) {
		this.boardsc = boardsc;
	}

	public String getSpecializationhsc() {
		return specializationhsc;
	}

	public void setSpecializationhsc(String specializationhsc) {
		this.specializationhsc = specializationhsc;
	}

	public int getPercenthsc() {
		return percenthsc;
	}

	public void setPercenthsc(int percenthsc) {
		this.percenthsc = percenthsc;
	}

	public String getGradehsc() {
		return gradehsc;
	}

	public void setGradehsc(String gradehsc) {
		this.gradehsc = gradehsc;
	}

	public Date getDophsc() {
		return dophsc;
	}

	public void setDophsc(Date dophsc) {
		this.dophsc = dophsc;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getSpecializationgrad() {
		return specializationgrad;
	}

	public void setSpecializationgrad(String specializationgrad) {
		this.specializationgrad = specializationgrad;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCourseduration() {
		return courseduration;
	}

	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}

	public Date getDopgrad() {
		return dopgrad;
	}

	public void setDopgrad(Date dopgrad) {
		this.dopgrad = dopgrad;
	}

	public int getDegreepercent() {
		return degreepercent;
	}

	public void setDegreepercent(int degreepercent) {
		this.degreepercent = degreepercent;
	}

	
    
    
    
}
