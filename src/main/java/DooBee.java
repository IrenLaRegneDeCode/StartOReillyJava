/**
 * Created by Ira on 27.07.2019.
 */
public class DooBee {
    public static void main(String[] args) {
        //DooBee();
        //beerSong(5);
        Quotes quoteGenerator = new Quotes();
        int x=0;
        while (x<10){
//            quoteGenerator.getQuote();
            System.out.println(quoteGenerator.toString()+quoteGenerator.getQuote()+" и "+quoteGenerator.getQuote());
//            System.out.println(quoteGenerator.wordListOne[(int)(Math.random()*12)]);
            x++;
        }
    }

    private static void beerSong(int beerNum) {
        //=5;
        String word="бутылок (бутылки)";
        while (beerNum>0){
            if (beerNum==1){
                word="бутылка";
            }
            System.out.println(beerNum+" "+word+" пива на стене");
            System.out.println(beerNum+" "+word+" пива");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum=beerNum-1;
            if (beerNum>0){
                //System.out.println(beerNum+ " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
    private static void dooBee() {
        int x=366;
        while (x<368){
            System.out.print("Doo");
            System.out.print("Bee");
            x=x+1;
        }
        if (x==368){
            System.out.print("Do");
        }
    }
}

