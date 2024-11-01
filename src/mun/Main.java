package mun;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Parent> parents=new ArrayList<>();
        parents.add(new Movie("love is blind","entertainment",130));
        parents.add(new Man("heal","decumentry",25));

        for (Parent pr:parents){
            pr.Info();
            pr.performAct();
        }
    }
}
