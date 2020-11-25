
public class Main {
    public static void main(String[] args)
    {

        Cat[] cafe = new Cat[9];


        cafe[0] = new Cat("Jingles");
        cafe[1] = new Cat("Steve");
        cafe[2] = new Cat("Jeff");
        cafe[3] = new Cat("Bob");
        cafe[4] = new Cat("Tom Cruise");
        cafe[5] = new Cat("Dill");
        cafe[6] = new Cat("Joe");
        cafe[7] = new Cat("Rengar");
        cafe[8] = new Cat("James");


        for (int i = 0; i < cafe.length; i++) {
            System.out.println("The cat " + cafe[i].getName() +" is "+cafe[i].getWeight()+" kgs and is "+ cafe[i].getAge()+" yrs old");
        }


        for (int i = 0; i < cafe.length; i++)
        {

            for (int j = 0; j < cafe.length - 1; j++)
            {
                // if the current cats weight is bigger than the one to the right
                if(cafe[j].getAge() < cafe[j+1].getAge())
                {
                    //SWAP THEM
                    Cat temp = cafe[j];
                    cafe[j] = cafe[j+1];
                    cafe[j+1] = temp;
                }
            }

        }
        System.out.println("======================================");

        for (int i = 0; i < cafe.length; i++) {
            System.out.println("The cat " + cafe[i].getName() +" is "+cafe[i].getWeight()+" kgs and is "+ cafe[i].getAge()+" yrs old");
        }


        String word = "tacocat";
        //             "aaccott"

    }
}
