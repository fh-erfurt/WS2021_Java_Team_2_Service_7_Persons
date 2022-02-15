package de.fherfurt.persons;

public class DeletedPerson {

    private int deletedPersonsRepositoryKey;
    private int personNumber;

    private DeletedPerson(int deletedPersonsRepositoryKey, int personNumber)
    {
        this.deletedPersonsRepositoryKey = deletedPersonsRepositoryKey;
        this.personNumber = personNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder
    {
        private int deletedPersonsrepositoryKey;
        private int personNumber;

        private Builder()
        {

        }

        public DeletedPerson build()
        {
            return new DeletedPerson(deletedPersonsrepositoryKey, personNumber);
        }

        public Builder setDeletedPersonsrepositoryKey(int deletedPersonsrepositoryKey) {
            this.deletedPersonsrepositoryKey = deletedPersonsrepositoryKey;
            return this;
        }

        public Builder setPersonNumber(int personNumber) {
            this.personNumber = personNumber;
            return this;
        }

    }

}
