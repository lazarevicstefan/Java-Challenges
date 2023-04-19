import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadatak03 {
    public static void ispisiPodatkeHeroja (LinkedHashMap<String,ArrayList<Integer>> heroji){
        for(Map.Entry<String,ArrayList<Integer>> kljucVrednosti: heroji.entrySet()){
            String heroName = kljucVrednosti.getKey();
            int hp = kljucVrednosti.getValue().get(0);
            int mp = kljucVrednosti.getValue().get(1);
            System.out.printf("%s\nHP: %d\nMP: %d\n",heroName,hp,mp);
        }
    }
    public static void castSpell (LinkedHashMap<String,ArrayList<Integer>> heroji, String heroName, int MPneeded, String speelNmae){
        ArrayList<Integer> stats = heroji.get(heroName);
        int mp = stats.get(1);
        if (mp >= MPneeded){
            mp = mp - MPneeded;
            heroji.get(heroName).set(1,mp);
            System.out.printf("%s has successfully cast %s and now has %d MP!\n",heroName,speelNmae,mp);
        }else {
            System.out.printf("%s does not have enough MP to cast %s!\n",heroName,speelNmae);
        }
    }
    public static void takeDamage(LinkedHashMap<String,ArrayList<Integer>> heroji, String heroName, int damage, String attacker){
        ArrayList<Integer> stats = heroji.get(heroName);
        int hp = stats.get(0);
        if (damage >= hp){
            System.out.printf("%s has been killed by %s!\n",heroName,attacker);
            heroji.remove(heroName);
        }else {
            hp = hp - damage;
            heroji.get(heroName).set(0,hp);
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n",heroName,damage,attacker,hp);
        }
    }
    public static void recharge (LinkedHashMap<String,ArrayList<Integer>> heroji, String heroName, int iznosDopune){
        int trenutnomp = heroji.get(heroName).get(1);
        int finalnaDopuna = trenutnomp + iznosDopune;
        if (finalnaDopuna > 200) finalnaDopuna = 200;
        int dopuna = finalnaDopuna - trenutnomp; /////////////////////////////////////////////////////////////
        heroji.get(heroName).set(1, finalnaDopuna);
        System.out.printf("%s recharged for %d MP!\n",heroName,dopuna);
    }
    public static void heal (LinkedHashMap<String,ArrayList<Integer>> heroji, String heroName, int iznosDopuneHP){
        int trenutniHP = heroji.get(heroName).get(0);
        int finalniHP = trenutniHP + iznosDopuneHP;
        if (finalniHP > 100) finalniHP = 100;
        int dopuna = finalniHP - trenutniHP;
        heroji.get(heroName).set(0,finalniHP);
        System.out.printf("%s healed for %d HP!\n",heroName,dopuna);
    }
    public static void main(String[] args) {

// 2
// Solmyr 85 120
// Kyrre 99 50
// Heal - Solmyr - 10
// Recharge - Solmyr - 50
// TakeDamage - Kyrre - 66 - Orc
// CastSpell - Kyrre - 15 - ViewEarth
// End

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        LinkedHashMap<String, ArrayList<Integer>> heroji = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] delovi = scan.nextLine().split(" ");
            String heroName = delovi[0];
            int HP = Integer.parseInt(delovi[1]);
            int MP = Integer.parseInt(delovi[2]);
            ArrayList<Integer> stats = new ArrayList<>();
            stats.add(HP);
            stats.add(MP);
            heroji.put(heroName,stats);
        }
        while (true){
            String unos = scan.nextLine();
            if (unos.equals("End")) break;
            String[] deloviKomande = unos.split(" - ");
            String komanda = deloviKomande[0];
//            System.out.println(komanda);
            if (komanda.equals("CastSpell")){
                String heroName = deloviKomande[1];
                int mpNeeded = Integer.parseInt(deloviKomande[2]);
                String spellName = deloviKomande[3];
                castSpell(heroji,heroName,mpNeeded,spellName);
            }else if (komanda.equals("TakeDamage")){
                String heroName = deloviKomande[1];
                int damage = Integer.parseInt(deloviKomande[2]);
                String attacker = deloviKomande[3];
                takeDamage(heroji,heroName,damage,attacker);
            }else if (komanda.equals("Recharge")){
                String heroName = deloviKomande[1];
                int iznosZaRecharge = Integer.parseInt(deloviKomande[2]);
                recharge(heroji,heroName,iznosZaRecharge);
            }else if (komanda.equals("Heal")){
                String heroName = deloviKomande[1];
                int iznosZaHeal = Integer.parseInt(deloviKomande[2]);
                heal(heroji,heroName,iznosZaHeal);
            }


        }

        ispisiPodatkeHeroja(heroji);

    }
}