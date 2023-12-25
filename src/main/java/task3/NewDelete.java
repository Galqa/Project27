
/*
 *  Написати методи видалення книги за id та за автором.
*/

package task3;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class NewDelete {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("authorhelper");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
    }
        public void deleteBookByIdAndAuthor(EntityManager entityManager, int id, Book author) {
            String query = "DELETE FROM Book b WHERE b.id = :id AND b.author = :author";
            entityManager.createQuery(query)
                    .setParameter("id", id)
                    .setParameter("book", author)
                    .executeUpdate();
        }


    }
