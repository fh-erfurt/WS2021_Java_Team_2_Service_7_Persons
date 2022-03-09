package de.fherfurt.person;

public class Person
{
    private String firstname;
    private String lastname;
    private String address;
    private String email;
    private String phonenumber;
    private String title;
    private String hireDate;
    private Enum faculty;
    private Boolean teachingFlag;
    private String room;
    private String major;
    private String immatriculationDate;
    private String exmatriculationDate;
    private Boolean tutorFlag;
    private Boolean scientificWorkerFlag;
    private String jobTitle;

    private Person(String firstname, String lastname, String address, String email, String phonenumber, String title, String hireDate,
                   Enum faculty, Boolean teachingFlag, String room, String major, String immatriculationDate,
                   String exmatriculationDate, Boolean tutorFlag, Boolean scientificWorkerFlag, String jobTitle) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
        this.email = email;
        this.phonenumber = phonenumber;
        this.title = title;
        this.hireDate = hireDate;
        this.faculty = faculty;
        this.teachingFlag = teachingFlag;
        this.room = room;
        this.major = major;
        this.immatriculationDate = immatriculationDate;
        this.exmatriculationDate = exmatriculationDate;
        this.tutorFlag = tutorFlag;
        this.scientificWorkerFlag = scientificWorkerFlag;
        this.jobTitle = jobTitle;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String firstname;
        private String lastname;
        private String address;
        private String email;
        private String phonenumber;
        private String title;
        private String hireDate;
        private Enum faculty;
        private Boolean teachingFlag;
        private String room;
        private String major;
        private String immatriculationDate;
        private String exmatriculationDate;
        private Boolean tutorFlag;
        private Boolean scientificWorkerFlag;
        private String jobTitle;

        private Builder() {

        }

        public Person build() {
            return new Person(firstname, lastname, address, email, phonenumber, title, hireDate, faculty, teachingFlag,
                    room, major, immatriculationDate, exmatriculationDate, tutorFlag, scientificWorkerFlag, jobTitle);
        }

        public Builder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public Builder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhonenumber(String phonenumber) {
            this.phonenumber = phonenumber;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setHireDate(String hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public Builder setFaculty(Enum faculty) {
            this.faculty = faculty;
            return this;
        }

        public Builder setTeachingFlag(Boolean teachingFlag) {
            this.teachingFlag = teachingFlag;
            return this;
        }

        public Builder setRoom(String room) {
            this.room = room;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setImmatriculationDate(String immatriculationDate) {
            this.immatriculationDate = immatriculationDate;
            return this;
        }

        public Builder setExmatriculationDate(String exmatriculationDate) {
            this.exmatriculationDate = exmatriculationDate;
            return this;
        }

        public Builder setTutorFlag(Boolean tutorFlag) {
            this.tutorFlag = tutorFlag;
            return this;
        }

        public Builder setScientificWorkerFlag(Boolean scientificWorkerFlag) {
            this.scientificWorkerFlag = scientificWorkerFlag;
            return this;
        }

        public Builder setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }
    }

    //only needed for other employees
    public static Person otherEmployee(String firstname,String lastname,String email,String jobTitle){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).setJobTitle(jobTitle).build();
    }

    //only needed for lecturers
    public static Person lecturer(String firstname,String lastname,String email,String phonenumber, String title, String hireDate, Enum faculty, Boolean teachingFlag, String room){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).setPhonenumber(phonenumber).setTitle(title).setHireDate(hireDate).setFaculty(faculty).setTeachingFlag(teachingFlag).setRoom(room).build();
    }

    //only needed for students
    public static Person student(String firstname,String lastname,String email,String major, String immatriculationDate, String exmatriculationDate, Boolean tutorFlag, Boolean scientificWorkerFlag){
        return builder().setFirstname(firstname).setLastname(lastname).setEmail(email).setMajor(major).setImmatriculationDate(immatriculationDate).setExmatriculationDate(exmatriculationDate).setTutorFlag(tutorFlag).setScientificWorkerFlag(scientificWorkerFlag).build();
    }
}
