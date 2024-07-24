public class JobApplication {

    public String name;
    public int age;
    public String dob;
    public String loc;
    public String qualification;
    public int markssslc;
    public String[] skills;
    public boolean status;

    public JobApplication() {
        System.out.println("Below Job Application details");
    }

    public JobApplication(String name) {
        this.name = name;
        System.out.println("Applicant Name is: " + name);
    }

    public JobApplication(int age, String name) {
        this("Nithin");
        this.age = age;
        this.name = name;
        System.out.println("Applicant age is: " + age);
        System.out.println("Applicant name is: " + name);
        System.out.println("2nd Constructor");
    }

    public JobApplication(String loc, String name, int age) {
        this.age = age;
        this.loc = loc;
        this.name = name;
        System.out.println("Age of the Applicant is: " + age);
        System.out.println("Current Location of Applicant is: " + loc);
        System.out.println("Applicant name is: " + name);
    }

    public JobApplication(String name, int age, String dob, String loc, String qualification, int markssslc, String[] skills, boolean status) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.loc = loc;
        this.qualification = qualification;
        this.markssslc = markssslc;
        this.skills = skills;
        this.status = status;
        System.out.println("Below shows all details of Job Applicant");
        System.out.println("Name of the Applicant is: " + name);
        System.out.println("Age of the Applicant is: " + age);
        System.out.println("Birth date of Applicant is: " + dob);
        System.out.println("Location Of The Applicant is: " + loc);
        System.out.println("Qualification Of Applicant is: " + qualification);
        System.out.println("Marks Gained in SSLC is: " + markssslc);
        for (String skill : skills) {
            System.out.println("Applicant Skills are: " + skill);
        }
        System.out.println("------------------Constructor Ended-----------------");
    }

    public int getApplicantDetails(int age) {
        if (age < 18) {
            System.out.println("Not eligible for Job: " + age);
        } else {
            System.out.println("Eligible for Job: " + age);
        }
        return age;
    }

    public String getApplicantDetails(String qualification, int age) {
        if (age > 21 && qualification.equals("BE")) {
            System.out.println("Eligible for Software Job");
            System.out.println("Qualification and Age of the Applicant is: Qualification: " + qualification + ":: Age: " + age);
        } else {
            System.out.println("Not eligible");
        }
        return qualification;
    }

    public String getApplicantDetails(String[] skills, String qualification, int age) {
        for (String skill : skills) {
            if (qualification.equals("Degree") && skill.equals("Java")) {
                System.out.println("Eligible for Java Developer Job");
                System.out.println("Qualification and Age of the Applicant is: Qualification: " + qualification + ":: Age: " + age + ":: Skills are: " + skill);
            } else {
                System.out.println("Not eligible");
            }
        }
        return qualification;
    }

    public double calculatePercentage() {
        int obtainedMarks = 430;
        int totalMarks = 600;
        double percentage = (obtainedMarks * 100.0) / totalMarks;
        System.out.println(percentage + "%");
        return percentage;
    }

    public short detail() {
        double degree = 5.0;
        String qualification = "BE";
        if (degree >= 5.0 && qualification.equals("BE")) {
            System.out.println("Eligible to apply for Software Developer");
        } else {
            System.out.println("Not eligible to apply for Software Developer");
        }
        return 10;
    }
}
