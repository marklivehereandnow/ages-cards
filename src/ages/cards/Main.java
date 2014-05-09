/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ages.cards;

import com.livehereandnow.ages.util.CardContentParser;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author mark
 */
public class Main {
    
    private static final String PERSISTENCE_UNIT_NAME = "agesPU";
    private static EntityManagerFactory factory;
    
    public static void main(String[] args) {
        CardContentParser parser = new CardContentParser();
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select t from Cards t ");
        List<Cards> list = q.getResultList();
        for (Cards cards : list) {
            System.out.println(cards.toString());
            parser.doParse(cards.getContent());
        }
        System.out.println("Different kinds of Cards: " + list.size());

        // create new todo
//    em.getTransaction().begin();
//    GameLive game = new GameLive();
//    game.setId(2);
//    game.setCardRow("1,2,3");
//    game.setP1Hand("4");
//    game.setP2Hand("5");
//    
//    em.persist(game);
//    em.getTransaction().commit();
//
//    em.close();
    }
    
}
