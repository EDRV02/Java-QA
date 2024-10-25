public class People {
    private String firtsName;
    private String lastName;
    private int dob;
    private int peopleCount = 0;
    public People(String firtsName, String lastName, int dob){
        this.dob = dob;
        this.firtsName= firtsName;
        this.lastName = lastName;
        peopleCount++;
    }

    public String getFirtsName() {
        return firtsName;
    }

    public void setFirtsName(String firtsName) {
        this.firtsName = firtsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }
    @Override
    public String toString(){
        return "Person { First Namee: "+ firtsName + " Last Name: " + lastName + " DOB: " + dob + "}";
    }
    public static void main(String[] args) {
        People n1 = new People("Eduardo", "Diaz", 22302);
        System.out.println(n1.toString());
        System.out.println(n1.getPeopleCount());

    }
}
