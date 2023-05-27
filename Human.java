//Classes
class Human

{
    private String filler;
    private String name;
    private String race;
    private String gender;
    private String ethnicity;
    private double heightInCentimeters;
    private double weightInPounds;
    private int agebyYear;
    
    //creates Human class w/ no variables
    public Human()
    {
        filler = "Unidentified";
        name = "Unidentified";
        race = "Unidentified";
        gender = "Unidentified";
        ethnicity = "Unidentified";
        heightInCentimeters = 0;
        weightInPounds = 0;
        agebyYear = 0;

    }


    //creates Human class w/all variables
    public Human(String f, String n, String r, String g, String e, double h, double w, int a)
    {
        filler = f;
        name = n;
        race = r;
        gender = g;
        ethnicity = e;
        heightInCentimeters = h;
        weightInPounds = w;
        agebyYear = a;
    }

    //creates Human class w/standard variables
    public Human(String f, String n, String g, String e, int a)
    {
        filler = f;
        name = n;
        gender = g;
        ethnicity = e;
        agebyYear = a;
    }

    
    //Methods
    public String toString() 
    {
        return "Name] " + name + "\nRace] " + race + "\nGender] " + gender + 
        "\nEthnicity] " + ethnicity + "\nHeight] " + heightInCentimeters + 
        " centimeters" + "\nWeight]" + weightInPounds  + " lbs"+ "\nAge]" + agebyYear;
    }

    public String toStringStandard() 
    {
        return "Name] " + name + "\nGender] " + gender + 
        "\nEthnicity] " + ethnicity + "\nAge]" + agebyYear;
    }
    
    public void setName(String n)
    {
        this.name = n;
    }

    public void setGender(String g)
    {
        this.gender = g;
    }

    public void setRace(String r) 
    {
        this.race = r;
    }

    public void setEthnicity(String e)
    {
        this.ethnicity = e;
    }

    public void setHeight(double h)
    {
        if(h < 50)
        {
            this.heightInCentimeters = 50;
        }
        else{
            this.heightInCentimeters = h;
        }
    }

    public void setWeight(double w)
    {
        if(w < 50)
        {
            this.weightInPounds = 50;
        }
        else{
            this.weightInPounds = w;
        }
    }

    public void setAge(int a)
    {
        if(a < 0)
        {
            this.agebyYear = 0;
        }
        else{
            this.agebyYear = a;
        }
    }



}
