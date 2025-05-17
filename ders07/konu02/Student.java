package ders07.konu02;


class Student implements Comparable
{
    int age;
    String name;
    double agno;

    public Student(int age, String name, double agno)
    {
        this.age=age;
        this.name=name;
        this.agno = agno;
    }

    public String toString() {
        return "Student [age=" + age + ", name=" +name +", " + "agno=" + agno + "]";
    }

    @Override
	public int compareTo(Object other)
	{
        Student that = (Student) other;
		if(this.agno < that.agno)
			return 1;
		else
			return -1;
	}

}