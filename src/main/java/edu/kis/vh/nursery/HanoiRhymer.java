package edu.kis.vh.nursery;

/**
 * Klasa HanoiRhymer dziedziczy po DefaultCountingOutRhymer i przesyla metode countIn
 */
public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * zmienna totalRejected przechowuje liczbe odrzuconych numerow
     */     private int totalRejected = 0;


    /**
     * metoda reportRejected zwraca totalRejected
     */
    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
