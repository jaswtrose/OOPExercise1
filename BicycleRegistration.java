public class BicycleRegistration
{
    public static void main(String [] Args) {

        Bicycle bike1 ,bike2;
        String owner1 , owner2;
        String tagNo1, tagNo2;

        bike1 = new Bicycle();
        bike1.setOwnerName("Naruto Uzumaki");

        bike2= new Bicycle();
        bike2.setOwnerName("Kaneki Ken");

        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();

        bike1 = new Bicycle();
        bike1.setid("1010-NU");

        bike2 = new Bicycle();
        bike2.setid("1220-KK");

        tagNo1 = bike1.getid();
        tagNo2 = bike2.getid();

        System.out.println(owner1 + " owns a bicycle with an ID of " + tagNo1 + ".");
        System.out.println(owner2 + " also owns a bicycle with an ID of " + tagNo2 + ".");
    }

}