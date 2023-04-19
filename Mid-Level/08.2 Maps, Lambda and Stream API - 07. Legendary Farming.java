import java.util.*;

public class Domaci07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedHashMap<String,Integer> lista = new LinkedHashMap<>();

        lista.put("shards",0);
        lista.put("fragments",0);
        lista.put("motes",0);

        boolean wh = true;
        while (wh) {
            String[] delovi = scan.nextLine().split(" ");

            for (int i = 0; i < delovi.length; i += 2) {
                Integer vrednost = Integer.parseInt(delovi[i]);
                String kljuc = (delovi[i + 1]).toLowerCase();

                if (lista.get("shards") <250 && lista.get("fragments") <250 && lista.get("motes") <250 ) {
                    if (!lista.containsKey(kljuc)) lista.put(kljuc, vrednost);
                    else lista.put(kljuc, lista.get(kljuc) + vrednost);
                }
            }
            for (Map.Entry<String,Integer> as : lista.entrySet()){
                if (as.getKey().equals("shards") ||as.getKey().equals("fragments")||as.getKey().equals("motes")) {
                    if (as.getValue() >= 250) {
                        wh = false;
                    }
                }

            }
        }
        boolean dalijeobt = false;
        String naziv = "";
        for(Map.Entry<String, Integer> a : lista.entrySet()){
            boolean iliILI = true;
            while (!dalijeobt && iliILI) {
                iliILI = false;
                if (a.getValue() >= 250) {
                    switch (a.getKey()) {
                        case "shards":
                            naziv = "Shadowmourne";
                            int k = a.getValue() - 250;
                            a.setValue(k);
                            dalijeobt = true;
                            break;
                        case "fragments":
                            naziv = "Valanyr";
                            int j = a.getValue() - 250;
                            a.setValue(j);
                            dalijeobt = true;
                            break;
                        case "motes":
                            naziv = "Dragonwrath";
                            int l = a.getValue() - 250;
                            a.setValue(l);
                            dalijeobt = true;
                            break;
                    }

                }
            }

//            System.out.printf("%s %d ",a.getKey(),a.getValue());
        }
        if (dalijeobt) System.out.printf("%s obtained!\n",naziv);
        int shards = 0;
        int fragments = 0;
        int motes = 0;
        if (lista.containsKey("shards")) shards = lista.get("shards");
        if (lista.containsKey("fragments")) fragments = lista.get("fragments");
        if (lista.containsKey("motes")) motes = lista.get("motes");
        System.out.printf("shards: %d\n",shards);
        lista.remove("shards");
        System.out.printf("fragments: %d\n",fragments);
        lista.remove("fragments");
        System.out.printf("motes: %d\n",motes);
        lista.remove("motes");
        for (Map.Entry<String,Integer> b : lista.entrySet()){
            System.out.printf("%s: %d\n",b.getKey(),b.getValue());
        }

    }
}