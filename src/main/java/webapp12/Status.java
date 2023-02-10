package webapp12;

public class Status {
    private String FirstName;
private String SecondName;
private String IdNumber;
private String group;
private String Reason ;
private String StartingDate ;
private String EndingDate;
private String NumberDays;
private String WhoAllowed;
private String fromwhom;
private String towhom;

public Status(){}



public String getFirstName() {
	return FirstName;
}

public void setFirstName(String firstName) {
	FirstName = firstName;
}

public String getSecondName() {
	return SecondName;
}

public void setSecondName(String secondName) {
	SecondName = secondName;
}

public String getIdNumber() {
	return IdNumber;
}

public void setIdNumber(String idNumber) {
	IdNumber = idNumber;
}

public String getReason() {
	return Reason;
}

public void setReason(String reason) {
	Reason = reason;
}

public String getStartingDate() {
	return StartingDate;
}

public void setStartingDate(String startingDate) {
	StartingDate = startingDate;
}

public String getEndingDate() {
	return EndingDate;
}

public void setEndingDate(String endingDate) {
	EndingDate = endingDate;
}

public String getNumberDays() {
	return NumberDays;
}

public void setNumberDays(String numberDays) {
	NumberDays = numberDays;
}

public String getWhoAllowed() {
	return WhoAllowed;
}

public void setWhoAllowed(String whoAllowed) {
	WhoAllowed = whoAllowed;
}
public String getGroup() {
	return group;
}

public void setGroup(String group) {
	this.group = group;
}
  
public String getfromWhom() {
	return fromwhom;
}

public void setfromwhom(String fromwhom) {
	this.fromwhom = fromwhom;
}
public String gettowhom() {
	return towhom;
}

public void settowhom(String towhom) {
	this.towhom = towhom;
}

}
