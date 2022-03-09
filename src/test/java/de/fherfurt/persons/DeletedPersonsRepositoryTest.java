package de.fherfurt.persons;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * Leider sind die Tests für die vorherige Löschfunktionalität hinfälllig,
 * da sie grundlegend verändert wurde, jedoch bleibt der Code für Dokumentationszwecke
 * und als Entwicklungsschritt auskommentiert bestehen
 *
 * @author Milena Neumann
 */
/*
class DeletedPersonsRepositoryTest
{

    @Test
    void shouldPersist()
    {
        //given
        DeletedPersonsRepository Test = new DeletedPersonsRepository();
        //whenangemessen

        for(int i=1; i<1000; i++)
        {
            Test.persist(i);
        }

        //then
        Assertions.assertThat(Test.deletedPersonStorage)
                .containsKey(4)
                .containsValue(3)
                .containsKey(999)
                .doesNotContainKey(1000)
                .hasSize(999);
    }

    @Test
    void TestIsPersonDeleted()
    {
        //given
        DeletedPersonsRepository Test = new DeletedPersonsRepository();
        //when
        Test.persist(1000);
        //then
        Assertions.assertThat(Test.isPersonDeleted(1000))
                .isTrue();

        Assertions.assertThat(Test.isPersonDeleted(2022))
                .isFalse();
    }

    @Test
    void shouldRemoveDeletedPerson()
    {
        //given
        DeletedPersonsRepository Test = new DeletedPersonsRepository();
        //when
        Test.persist(1001);
        Test.persist(1002);
        Test.removeDeletedPerson(1001);
        //then
        Assertions.assertThat(Test.isPersonDeleted(1001))
                .isFalse();

        Assertions.assertThat(Test.removeDeletedPerson(1003))
                .isFalse();
    }

    @Test
    void shouldShowDeletedPersons()
    {
        //given
        DeletedPersonsRepository Test = new DeletedPersonsRepository();
        //when
        Test.persist(1);
        Test.persist(123);
        Test.persist(3);
        Test.persist(4);
        Test.removeDeletedPerson(3);
        Test.persist(3);
        //then

        Assertions.assertThat(Test.showDeletedPersons())
                .isEqualTo("1\n" +
                           "3\n" +
                           "4\n" +
                           "123\n")
                .isNotEmpty()
                .isNotNull()
                .isNotEqualTo("3");

    }

    @Test
    void shouldShowLargeAmountOfDeletedPersons()
    {
        //given
        DeletedPersonsRepository Test = new DeletedPersonsRepository();
        //when
       for(int i = 0; i < 1000; i++)
       {
           Test.persist(i);
       }
        //then

        Assertions.assertThat(Test.showDeletedPersons())
                .isNotEmpty()
                .isNotNull()
                .isNotEqualTo("3");
    }
}
*/