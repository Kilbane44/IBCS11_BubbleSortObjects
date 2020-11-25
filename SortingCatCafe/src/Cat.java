public class Cat {

    private double weight;
    private int age;
    private String name;

    Cat(String _name) {
        name = _name;
        //           0 - 1       *   (max - min) + min
        age = (int) (Math.random() * (25 - 1) + 1);

        weight = Math.random() * (15 - 2) + 2;
    }


    public String getName() {
        return name;
    }


    public int getAge()
    {
        return age;
    }



    public double getWeight()
    {
        return weight;
    }




}
