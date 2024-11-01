import java.util.ArrayList;


    import java.util.ArrayList;
public class MAIN {

        public static void main(String[] args) {

            ArrayList<Entity> Ent = new ArrayList<>();

            Ent.add(new First("Muna", "bopio", 2011, 8));
            Ent.add(new Second("xamdi", "asb", 2013, "USA"));
            Ent.add(new Third("axmed", "self steam", 2020, 3));


            for(Entity U:Ent)
            {
               U.displayInfo();
                U.performAction();
                System.out.println("---");
            }

            }
        }


