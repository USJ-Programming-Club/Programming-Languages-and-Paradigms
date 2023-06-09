//public class Minecraft {
//
//    public static void main(String[] args) {
//
//        Sword basicSword = new Sword();
//        System.out.println(basicSword + " without any enchantment");
//        System.out.println("Cost: " + basicSword.getCost() + " enchantment levels \n");
//
//        Sword rigidSword = new Unbreaking(new Sword());
//        System.out.println(rigidSword);
//        System.out.println("Cost: " + rigidSword.getCost() + " enchantment levels \n");
//
//        Sword excalibur = new Unbreaking(new Sharpness(new Sword()));
//        System.out.println(excalibur);
//        System.out.println("Cost: " + excalibur.getCost() + " enchantment levels \n");
//
//        /*Output:
//
//        A sword without any enchantment
//        Cost: 0 enchantment levels
//
//        A sword, with Unbreaking
//        Cost: 2 enchantment levels
//
//        A sword, with Sharpness, with Unbreaking
//        Cost: 5 enchantment levels
//        */
//    }
//}